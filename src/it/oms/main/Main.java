package it.oms.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;

import it.oms.controller.Controller;
import it.oms.controller.ControllerImpl;
import it.oms.utils.DNSManager;
import it.oms.utils.ZipManager;

public class Main {

    public static void main(String[] args) {
        try {
            final Controller controller = new ControllerImpl();
            controller.launch(args);

        } catch (Exception e) {
            // TODO speaking errors: I want to know what is wrong!
            System.out.println("Cannot correctly initialize the application. Error: " + e.getMessage());
        }
    }
}
