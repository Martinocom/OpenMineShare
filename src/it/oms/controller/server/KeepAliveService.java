package it.oms.controller.server;

public interface KeepAliveService {
	
	/**
	 * Return the timeout (in ms), after which the client is considered dead
	 * @return timeout (in ms), after which the client is considered dead
	 */
	int getTimeoutInMs();
	
	/**
	 * Set the timeout (in ms), after which the client is considered dead
	 * @param timeout - timeout (in ms), after which the client is considered dead
	 */
	void setTimeoutInMs(final int timeout);
	
	/**
	 * Get the keep-alive listener
	 * @return the keep-alive listener
	 */
	KeepAliveListener getAliveListener();
	
	/**
	 * Set the keep-alive listener
	 * @param listener - keep-alive listener
	 */
	void setAliveListener(final KeepAliveListener listener);
}
