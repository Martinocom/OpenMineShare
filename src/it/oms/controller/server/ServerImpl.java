package it.oms.controller.server;

import java.util.Optional;

import org.rapidoid.setup.On;

import it.oms.controller.server.ServerResponses.ServerAvaiability;

public class ServerImpl implements Server, KeepAliveListener {

	private static final int TIMEOUT = 30000;
	
	private KeepAliveService keepAliveService;
	private ServerListener serverListener;
	private ServerAPI serverAPI;
	
	//TODO move this logic to model/controller
	//private boolean isServerCurrentlyOpen = false;
	//private Optional<String> address = Optional.empty();
	
	@Override
	public void start() {
	
		On.get(ServerPaths.REQUEST_AVAIABLE_SERVERS.getPathWithSlash()).json(() -> {					
			ServerAvaiability response = getServerAPI().onRequestAvaiableServer();
			return response.toJson();
		});
		
		On.get(ServerPaths.REQUEST_HOST_SERVER.getPathWithSlash()).json(() -> {
			AckServerOpeningAvaiability response = getServerAPI().onRequestHostServer();
			serverListener.onClientRequestServerCreation();
			return response.toJson();
		});
		
		// TODO manage download from link, like "http://myserver.no-ip.com/server.zip"
		/*
		On.get(ServerPaths.REQUEST_SERVER_FILES.getPathWithSlash()).json((String path) -> {
			getServerAPI().onRequestServerFiles();
			return "";
		});*/
		
		On.get(ServerPaths.ACK_SERVER_OPENED.getPathWithSlash()).json((String msg) -> {
			getServerAPI().onAckServerOpened();
			serverListener.onClientServerOpen();
			return "";
		});
			
		On.get(ServerPaths.ACK_SERVER_ERROR.getPathWithSlash()).json((String error) -> {
			getServerAPI().onAckError();
			serverListener.onClientServerError();
			return "";
		});
		
		On.get(ServerPaths.ACK_SERVER_CLOSED.getPathWithSlash()).json(() -> {
			getServerAPI().onAckError();
			serverListener.onClientServerClose();
			return "";
		});
		
		getServerListener().onServerStarted();
	}

	@Override
	public void stop() {
		getServerListener().onServerStopped();
	}

	@Override
	public void setKeepAliveService(KeepAliveService service) {
		this.keepAliveService = service;
		getKeepAliveService().setAliveListener(this);
		
		//TODO when creating the keep alive service, make the user choose IMMEDIATLY what is the timeout
		getKeepAliveService().setTimeoutInMs(TIMEOUT);
	}

	@Override
	public KeepAliveService getKeepAliveService() {
		return this.keepAliveService;
	}

	@Override
	public void setServerAPI(ServerAPI serverAPI) {
		this.serverAPI = serverAPI;
	}

	@Override
	public ServerAPI getServerAPI() {
		return this.serverAPI;
	}
	
	
	@Override
	public void onAliveConnectionDetected() {
		getServerListener().onClientStillAlive();
	}
	
	@Override
	public void onDeadConnectionDetected() {
		getServerListener().onClientDead();
	}

	@Override
	public void setServerListener(ServerListener serverListener) {
		this.serverListener = serverListener;
	}

	@Override
	public ServerListener getServerListener() {
		return this.serverListener;
	}
	

}
