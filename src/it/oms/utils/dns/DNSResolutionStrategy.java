package it.oms.utils.dns;

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
