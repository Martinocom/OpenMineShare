package it.oms.utils;

/**
 * Basis for a DNS update resolution strategy.
 */
public interface DNSResolutionStrategy {
    /**
     * Generates the full complete cURL request.
     * 
     * @return the request
     */
    String generateCurlRequest();
}
