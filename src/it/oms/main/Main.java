package it.oms.main;

import org.tinylog.Logger;

import it.oms.controller.Controller;
import it.oms.controller.ControllerImpl;

public class Main {

    public static void main(String[] args) {
        try {
            final Controller controller = new ControllerImpl();
            controller.launch(args);
        } catch (Exception e) {
            // TODO speaking errors: I want to know what is wrong!
            Logger.error("Cannot correctly initialize the application." + e.getMessage());
        }
    }
}
