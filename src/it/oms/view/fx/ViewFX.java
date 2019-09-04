package it.oms.view.fx;

import it.oms.controller.Controller;
import it.oms.view.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ViewFX extends Application implements View {
	
	private Controller controller;
	private Stage stage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(action -> {
        	System.out.println("Hello World!");
        });

        final StackPane root = new StackPane();
        root.getChildren().add(btn);

        final Scene scene = new Scene(root, ViewFXAttributes.WIDTH, ViewFXAttributes.HEIGHT);       
		
		this.stage = primaryStage;
		this.stage.setScene(scene);
		this.stage.setTitle(ViewFXAttributes.TITLE);
		this.stage.show();	
	}
	
	
	@Override
	public void setController(final Controller controller) {
		this.controller = controller;
	}

	@Override
	public Controller getController() {
		return this.controller;
	}
	

	@Override
	public void show(String[] args) throws Exception {
		Application.launch(this.getClass(), args);
	}
	

	@Override
	public void close() throws Exception {
		this.stage.close();	
	}
}
