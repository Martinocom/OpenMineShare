package it.oms.utils.dns;

/**
 * Provides basic functions for a DNS update tool.
 *
 */
public interface DNSManager {

    /**
     * Updates the DNS record just sending a raw curl-like request. No validity
     * check is provided.
     * 
     * @param rawURL the url
     * @return if the request went fine (dafault {@code true} unless otherwise
     *         specified)
     */
    boolean updateRecord(String rawURL);

}
