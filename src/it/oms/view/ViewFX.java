package it.oms.view;

import javafx.application.Application;
import javafx.stage.Stage;

public class ViewFX extends Application implements View {

	private Stage primaryStage;
	private Controller controller;
	
	@Override
	public void setController(final Controller controller) {
		this.controller = controller;
	}

	@Override
	public Controller getController() {
		return this.controller;
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
	}

	@Override
	public void show() {
		this.primaryStage.show();
	}
	
	/**
	 * A better version for launching a GUI, when you can specify the title, width and height of the window.
	 * @param title - title of the window,
	 * @param width - with of the window,
	 * @param height - height of the window,
	 */
	public void show(final String title, final double width, final double height)  {
		this.primaryStage.setTitle(title);
		this.primaryStage.setWidth(width);
		this.primaryStage.setHeight(height);
		this.show();
	}

	@Override
	public void close() {
		this.primaryStage.close();
	}
	
}
