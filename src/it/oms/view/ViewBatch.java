package it.oms.view;

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
	public void show() {
		// TODO there is something to do when launching console?
	}

	@Override
	public void close() {
		// TODO there is something to do when closing console?
	}
	
}
