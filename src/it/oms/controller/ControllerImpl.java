package it.oms.controller;

import java.util.Map;

import it.oms.controller.server.ServerListener;
import it.oms.view.View;
import it.oms.view.batch.ViewBatch;
import it.oms.view.fx.ViewFX;

public class ControllerImpl implements Controller {
	
	private ServerListener serverListener;
	private View view;

	@Override
	public void launch(String[] args) throws Exception {
		if (args.length == 0) {
			this.view = new ViewBatch();
		} else {
			this.view = new ViewFX();
		}
		
		this.view.setController(this);
		this.view.show(args);
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
