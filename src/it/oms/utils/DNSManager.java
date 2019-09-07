package it.oms.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Provides basic functions for a DNS update tool.
 */
public final class DNSManager {

    private static final int STATUS_OK = 200;

    private static class DNSManagerHolder {
        private static final DNSManager SINGLETON = new DNSManager(); // NOPMD
    }

    private DNSManager() {
    };

    /**
     * @return a instance of the singleton
     */
    public static DNSManager get() {
        return DNSManagerHolder.SINGLETON;

    }

    /**
     * Updates the DNS record just sending a raw curl-like request. No validity
     * check is provided.
     * 
     * @param resolutor the {@link DNSResolutionStrategy} useful to generate the
     *                  request
     * @return the server response
     * @throws IOException if an exception occurs while sending the request
     */
    public String updateRecord(final DNSResolutionStrategy resolutor) throws IOException {
        final String request = resolutor.generateCurlRequest();
        final HttpGet getRequest = new HttpGet(request);

        final DefaultHttpClient httpClient = new DefaultHttpClient();
        final HttpResponse response = httpClient.execute(getRequest);

        if (response.getStatusLine().getStatusCode() != STATUS_OK) {
            throw new RuntimeException(String.valueOf(response.getStatusLine().getStatusCode()));
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())))) {
            final StringBuilder bld = new StringBuilder();
            String output;
            do {
                output = br.readLine();
                if (output != null) {
                    bld.append(output);
                }
            } while (output != null);

            httpClient.getConnectionManager().shutdown();
            br.close();

            return bld.toString();
        } catch (IOException e) {
            throw e;
        }

    }

}
