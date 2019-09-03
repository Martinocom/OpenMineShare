package it.oms.controller;

import java.util.Map;

import it.oms.controller.server.ServerListener;

public class ControllerImpl implements Controller {
	
	private ServerListener serverListener;

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launch(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigurationFile(String pathToFile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean generateConfigurationFile(Map<String, String> values) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkConfigurationIntegrity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMinecraftFolderIntegrity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean startServer() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public void setServerListener(ServerListener listener) {
		this.serverListener = listener;
	}

	@Override
	public ServerListener getServerListener() {
		return this.serverListener;
	}


}
