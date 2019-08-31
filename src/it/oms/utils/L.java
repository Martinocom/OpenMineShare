package it.oms.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Provides a cross platform LOGGER, useful to print messages to console with
 * custom formats and colors.
 */
public final class L {
    private static final String SEPARATOR = " - ";
    private static final Object LOCK = new Object();
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    private static class ConsolePrinterHolder {
        private static final L SINGLETON = new L(); // NOPMD
    }

    private L() {

    }

    /**
     * @return the printer class
     */
    public static L getPrinter() {
        return ConsolePrinterHolder.SINGLETON;
    }

    /**
     * Prints the date and a normal message without formatting.
     * 
     * @param message the message to be printed
     */
    public void println(final String message) {
        synchronized (LOCK) {

        }
    }

    /**
     * 
     * @param message
     * @param printDate
     */
    public void println(final String message, final boolean printDate) {
        synchronized (LOCK) {
            Date date = new Date();

            System.out.println(formatter.format(date));
        }
    }

    /**
     * Prints the date and the message with a cyan foreground color, you can use it
     * to warn when some procedure starts.
     * 
     * @param message the message to be printed
     */
    public void printlnProcedureStarted(final String message) {
        synchronized (LOCK) {

        }
    }

    /**
     * Prints the date and the message with a green foreground color, you can use it
     * to warn when some procedure finished without errors.
     * 
     * @param message the message to be printed
     */
    public void printlnSuccess(final String message) {
        synchronized (LOCK) {

        }
    }

    /**
     * Prints the date and the message with a red foreground color, you can use it
     * to warn when some procedure finished with errors.
     * 
     * @param message the message to be printed
     */
    public void printlnError(final String message) {
        synchronized (LOCK) {

        }
    }
}
