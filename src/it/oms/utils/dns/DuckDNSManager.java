package it.oms.utils.dns;

import inet.ipaddr.IPAddress;

/**
 * Wrapper for <a href="http://duckdns.org">DuckDNS</a>.
 */
public final class DuckDNSManager extends DNSManagerAdvanced {

    private String token;
    private boolean verbose;

    private DuckDNSManager(final String dnsARecord) {
        super(dnsARecord);
        this.token = null;
        this.verbose = false;
    }

    private DuckDNSManager(final String dnsARecord, final String token) {
        this(dnsARecord);
        this.token = token;
    }

    /**
     * Builds a DuckDNS manager.
     * 
     * @param dnsARecord (required by API) the A record previously registered
     * @param token      (required by API) needed to authenticate the update request
     * @param ip         (required) the IP address used to link the A record
     */
    public DuckDNSManager(final String dnsARecord, final String token, final IPAddress ip) {
        this(dnsARecord, token);
        this.updateRecord(ip);
    }

    /**
     * 
     * Builds a DuckDNS manager.
     * 
     * @param dnsARecord (required by API) the A record previously registered
     * @param token      (required by API) needed to authenticate the update request
     * @param ip         (required) the IP address used to link the A record
     * @param verbose    (optional) during the update forcibly checks whether the
     *                   request went fine
     */
    public DuckDNSManager(final String dnsARecord, final String token, final IPAddress ip, final boolean verbose) {
        this(dnsARecord, token, ip);
        this.verbose = verbose;
    }

    @Override
    public boolean updateRecord(final IPAddress ipAddress) {
        String composedURL = "";
        boolean requestOk = false;

        /// TODO

        return verbose ? requestOk : super.updateRecord(composedURL);
    }

}
