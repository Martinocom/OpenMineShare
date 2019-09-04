package it.oms.view.batch;

import it.oms.controller.Controller;
import it.oms.view.View;

public class ViewBatch implements View {

	private Controller controller;
	
	@Override
	public void setController(final Controller controller) {
		this.controller = controller;
	}

	@Override
	public Controller getController() {
		// TODO Auto-generated method stub
		return this.controller;
	}

	@Override
	public void show(String[] args) {
		System.out.println("You're a pro: batch mode activated!");
	}

	@Override
	public void close() {
		// TODO there is something to do when closing console?
	}
	
}
