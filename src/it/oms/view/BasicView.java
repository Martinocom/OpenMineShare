package it.oms.view;

import it.oms.controller.Controller;

/**
 * Basic structure for a view.
 */
public abstract class BasicView implements View {

    private Controller controller;

    @Override
    public final void setController(final Controller controller) {
        this.controller = controller;
    }

    @Override
    public final Controller getController() {
        return this.controller;
    }

    @Override
    public abstract void show(String[] args) throws Exception;

    @Override
    public abstract void close() throws Exception;

    @Override
    public abstract void showError(String message);

    @Override
    public abstract void showWarning(String message);

    @Override
    public abstract void showInfo(String message);
}
