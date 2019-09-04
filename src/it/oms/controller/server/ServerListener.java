package it.oms.controller.server;

public interface ServerListener {

	/**
	 * Event launched when the server is successfully started
	 */
	void onServerStarted();
	
	/**
	 * Event launched when the server is successfully stopped
	 */
	void onServerStopped();
	
	/**
	 * Event launched when the server is doing something wrong
	 * @param message - message of what is the problem now
	 */
	void onServerError(String message);
	
	
	
	
	//TODO add username, IP and other things
	/**
	 * Event launched when a user successfully open the server
	 */
	void onClientServerOpen();
	
	/**
	 * Event launched when a user apply for the server creation
	 */
	void onClientRequestServerCreation();
	
	/**
	 * Event launched when a user successfully close the server
	 */
	void onClientServerClose();
	
	/**
	 * Event launched when a user has some problems with his server
	 */
	void onClientServerError();
	
	/**
	 * Event launched when a client is still alive
	 */
	void onClientStillAlive();
	
	/**
	 * Event launched when a client die
	 */
	void onClientDead();
}
