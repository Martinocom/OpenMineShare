package it.oms.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import it.oms.utils.dns.DNSManager;

public class Tests {

    @Test
    public void test() {
        // Generic REST test
        try {
            System.out.println(DNSManager.get().updateRecord(() -> {
                return "https://api.themoviedb.org/3/movie/76341?api_key=30acda80a2099a558cbf40a5e453bdea";
            }));
        } catch (IOException e) {
            Assertions.fail();
        }
    }

}
