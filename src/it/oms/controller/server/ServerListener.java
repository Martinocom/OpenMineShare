package it.oms.controller.server;

public interface ServerListener {

	/**
	 * Event launched when the server is successfully started
	 */
	void OnServerStarted();
	
	/**
	 * Event launched when the server is successfully stopped
	 */
	void OnServerStopped();
	
	/**
	 * Event launched when the server is doing something wrong
	 * @param message - message of what is the problem now
	 */
	void OnServerError(String message);
}
