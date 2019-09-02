package it.oms.utils.dns;

import java.time.LocalDateTime;
import java.util.Optional;

import inet.ipaddr.IPAddress;

/**
 * Provides the basic structure in order to build a specific DNS manager.
 */
public abstract class DNSManagerAdvanced extends DNSManagerBasic implements DNSManagerExtended {

    private IPAddress ip;
    private final String dnsARecord;
    private LocalDateTime latestARecordUpdate;

    /**
     * Creates a new DNS manager.
     * 
     * @param dnsARecord the current
     */
    public DNSManagerAdvanced(final String dnsARecord) {
        super();
        this.dnsARecord = dnsARecord;
        this.ip = null;
        this.latestARecordUpdate = null;
    }

    @Override
    public abstract boolean updateRecord(IPAddress ipAddress);

    @Override
    public final Optional<IPAddress> getCurrentIPAddress() {
        return Optional.ofNullable(this.ip);
    }

    @Override
    public final String getARecord() {
        return dnsARecord;
    }

    @Override
    public final Optional<LocalDateTime> getLatestUpdateTime() {
        return Optional.ofNullable(this.latestARecordUpdate);
    }

}
