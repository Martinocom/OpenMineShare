package it.oms.controller.server;

import org.rapidoid.setup.On;

public class ServerImpl implements Server, KeepAliveListener {

	private static final int TIMEOUT = 30000;
	
	private KeepAliveService keepAliveService;
	private ServerAPI serverAPI;
	
	@Override
	public void start() {
		
		//TODO change the server API to return common understandable jsons
		On.get(ServerPaths.GET_AVAIABLE_SERVERS.getPathWithSlash()).json((String msg) -> {
			getServerAPI().onMessageToGetAvaiableServer();
			return "";
		});
		
		On.get(ServerPaths.REQUEST_HOST_SERVER.getPathWithSlash()).json((String msg) -> {
			
			
			getServerAPI().onMessageToRequestHostServer(getKeepAliveService());
			return "";
		});
		
		On.get(ServerPaths.GET_SERVER_FILES.getPathWithSlash()).json((String msg) -> {
			getServerAPI().onMessageToGetServerFiles();
			return "";
		});
		
		On.get(ServerPaths.SERVER_OPENED.getPathWithSlash()).json((String msg) -> {
			getServerAPI().onMessageServerOpened();
			return "";
		});
		
		On.get(ServerPaths.SERVER_NOT_OPENED.getPathWithSlash()).json((String msg) -> {
			getServerAPI().onMessageServerNotOpened();
			return "";
		});
		
		On.get(ServerPaths.SERVER_ERROR.getPathWithSlash()).json((String msg) -> {
			getServerAPI().onMessageError();
			return "";
		});
	}

	@Override
	public void stop() {
		
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
		// TODO must do something if connection is ok?
	}
	
	@Override
	public void onDeadConnectionDetected() {
		// TODO must do something to interrupt current client for beeing the choosen one: he is dead!
	}
	

}
