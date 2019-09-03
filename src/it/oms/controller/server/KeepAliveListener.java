package it.oms.controller.server;

public interface KeepAliveListener {

	/**
	 * Used when connection is detected as "alive"
	 */
	void onAliveConnectionDetected();
	
	/**
	 * Used when connection is detected as "dead"
	 */
	void onDeadConnectionDetected();
	
}
