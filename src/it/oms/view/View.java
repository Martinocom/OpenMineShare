package it.oms.view;

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
	void show();
	
	/*
	 * Close the view
	 */
	void close();
}
