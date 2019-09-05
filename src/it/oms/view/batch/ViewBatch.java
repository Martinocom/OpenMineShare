package it.oms.view.batch;

import org.tinylog.Logger;
import it.oms.view.BasicView;

/**
 *
 */
public class ViewBatch extends BasicView {

    @Override
    public void show(final String[] args) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public final void showError(final String message) {
        Logger.error(message);
    }

    @Override
    public final void showWarning(final String message) {
        Logger.warn(message);
    }

    @Override
    public final void showInfo(final String message) {
        Logger.info(message);
    }

}
