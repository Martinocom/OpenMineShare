package it.oms.controller;

import java.util.Map;
import it.oms.controller.server.ServerListener;

public interface Controller {
	
	/**
	 * Launch the application with all default args. This will launch also the GUI interface
	 */
	void launch();
	
	/**
	 * Launch the application, parsing some parameters. This will launch the app in batch-mode
	 * @param args
	 */
	void launch(String[] args);
	
	/**
	 * Set the path for the configuration file
	 * @param pathToFile - path to the configuration file
	 */
	void setConfigurationFile(String pathToFile);
	
	//TODO how to limit users to not overload config file with useless parameters?
	/**
	 * Generate the configuration file by giving the pair of values to configure
	 * @param values - pair of String - String to save in the configuration file
	 * @return <b>true</b> if configuration file was successfully created, <b>false</b> otherwise
	 */
	boolean generateConfigurationFile(Map<String, String> values);
	
	/**
	 * Check if configuration file is all ok
	 * @return <b>true</b> if configuration file is ok, <b>false</b> otherwise
	 */
	boolean checkConfigurationIntegrity();
	
	/**
	 * Check if folder with minecraft stuff is ok
	 * @return <b>true</b> minecraft folder is ok, <b>false</b> otherwise
	 */
	boolean checkMinecraftFolderIntegrity();
	
	
	/**
	 * Begins procedure to launch the server, that will listen to messages coming from clients
	 * @return <b>true</b> minecraft folder is ok, <b>false</b> otherwise
	 */
	boolean startServer();
	
	/**
	 * Set the listener for the server events
	 * @param listener
	 */
	void setServerListener(ServerListener listener);
	
	/**
	 * Returns the server listener
	 * @return the server listener object
	 */
	ServerListener getServerListener();
	
}