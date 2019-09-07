package it.oms.test;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import it.oms.utils.DNSManager;

/**
 * Tests the system architecture.
 */
public class Tests {

    /**
     * Tests the {@link DNSManager} utility class.
     */
    @Test
    public void testDNSManager() {
        // Generic REST-GET test
        try {
            System.out.println(DNSManager.get().updateRecord(() -> {
                return "https://api.themoviedb.org/3/movie/76341?api_key=30acda80a2099a558cbf40a5e453bdea";
            }));
        } catch (IOException e) {
            Assertions.fail();
        }
    }

    /**
     * 
     */
    @Test
    public void testZipBasic() {
        /*
         * try { ZipManager.get().basicZip("", ""); } catch (FileNotFoundException e) {
         * Assertions.fail(); } catch (IOException e) { Assertions.fail(); }
         */
    }
}
