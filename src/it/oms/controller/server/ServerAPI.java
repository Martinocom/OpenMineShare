package it.oms.controller.server;

import it.oms.controller.server.ServerResponses.*;

public interface ServerAPI {

	/**
	 * Used when a client ask if there's a server opened
	 */
	ServerAvaiability onRequestAvaiableServer();
	
	/**
	 * Used when a client apply for opening the server on his machine
	 * @param service - keep-alive service that will be used to check if client is not dead
	 */
	AckServerOpeningAvaiability onRequestHostServer();
	
	/**
	 * Used when a client apply for the resoruces to open the server
	 * @param pathToFiles - path to resources where client can apply for
	 */
	void onRequestServerFiles(final String pathToFiles);
	
	/**
	 * Used when a client open the server succesfully
	 */
	void onAckServerOpened();
	
	/**
	 * Used when a client doesn't open the server
	 */
	void onAckServerNotOpened();
	
	/**
	 * Used whenever the user get an error
	 */
	void onAckError();
	
}
