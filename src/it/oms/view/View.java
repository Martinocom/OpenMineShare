package it.oms.view;

import it.oms.controller.Controller;

public interface View {
	
	/**
	 * Set the controller for the view
	 */
	void setController (final Controller controller);
	
	/**
	 * Get the controller of the view
	 * @return the controller of the view
	 */
	Controller getController();
	
	/**
	 * Show the view
	 */
	void show(String[] args) throws Exception;
	
	/*
	 * Close the view
	 */
	void close() throws Exception;
}
