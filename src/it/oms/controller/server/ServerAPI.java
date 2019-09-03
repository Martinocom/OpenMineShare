package it.oms.controller.server;

public interface ServerAPI {

	/**
	 * Used when a client ask if there's a server opened
	 */
	void onMessageToGetAvaiableServer();
	
	/**
	 * Used when a client apply for opening the server on his machine
	 * @param service - keep-alive service that will be used to check if client is not dead
	 */
	void onMessageToRequestHostServer(final KeepAliveService service);
	
	/**
	 * Used when a client apply for the resoruces to open the server
	 */
	void onMessageToGetServerFiles();
	
	/**
	 * Used when a client open the server succesfully
	 */
	void onMessageServerOpened();
	
	/**
	 * Used when a client doesn't open the server
	 */
	void onMessageServerNotOpened();
	
	/**
	 * Used whenever the user get an error
	 */
	void onMessageError();
	
}
