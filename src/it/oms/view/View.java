package it.oms.view;

import it.oms.controller.Controller;

/**
 * The base features of the UI.
 *
 */
public interface View {

    /**
     * Sets the controller for the view.
     * 
     * @param controller the {@link Controller} of the view in the MVC paradigm
     */
    void setController(Controller controller);

    /**
     * Gets the controller of the view.
     * 
     * @return the controller of the view
     */
    Controller getController();

    /**
     * Shows the view.
     * 
     * @param args the arguments passed to the UI by the command line
     * @throws Exception if an error occurs when starting the UI
     */
    void show(String[] args) throws Exception;

    /**
     * Closes the view.
     * 
     * @throws Exception if an error occurs when closing the UI
     */
    void close() throws Exception;

    /**
     * Shows an error.
     * 
     * @param message the error message
     */
    void showError(String message);

    /**
     * Shows a warning.
     * 
     * @param message the warning message
     */
    void showWarning(String message);

    /**
     * Shows an info.
     * 
     * @param message the info message
     */
    void showInfo(String message);
}
