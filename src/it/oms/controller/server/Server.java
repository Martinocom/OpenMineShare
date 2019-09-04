package it.oms.controller.server;

public interface Server {
	
	/**
	 * Starts the server
	 */
	void start();
	
	/**
	 * Stops the server
	 */
	void stop();
	
	/**
	 * Makes the server use a Keep-Alive service, when connected to a client
	 * @param service - service used to keep the client alive during connection
	 */
	void setKeepAliveService(final KeepAliveService service);
	
	/**
	 * Get the keep-alive service of the server
	 * @return keep-alive service of the server
	 */
	KeepAliveService getKeepAliveService();
	
	/**
	 * Set the server listener, for events
	 * @param serverListener - the server listener
	 */
	void setServerListener(final ServerListener serverListener);
	
	/**
	 * Get the server listener, for events
	 * @return the server listener
	 */
	ServerListener getServerListener();
	
	/**
	 * Set the APIs of the server
	 * @param serverAPI - APIs of the server
	 */
	void setServerAPI(final ServerAPI serverAPI);
	
	/**
	 * Get the APIs of the server
	 * @return the APIs of the serve r
	 */
	ServerAPI getServerAPI();

	
}
