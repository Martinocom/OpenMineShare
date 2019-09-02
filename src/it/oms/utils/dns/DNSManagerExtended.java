package it.oms.utils.dns;

import java.time.LocalDateTime;
import java.util.Optional;

import inet.ipaddr.IPAddress;

/**
 * Skeleton for building an extended DNS manager.
 */
public interface DNSManagerExtended extends DNSManager {

    /**
     * Updates the DNS A record with the specified IP address.
     * 
     * @param ipAddress the current public IP address of the host
     * @return if the request went fine
     */
    boolean updateRecord(IPAddress ipAddress);

    /**
     * 
     * @return the latest {@link Optional} {@link IPAddress} synchronized with the A
     *         record
     */
    Optional<IPAddress> getCurrentIPAddress();

    /**
     * 
     * @return the A record
     */
    String getARecord();

    /**
     * 
     * @return the {@link Optional} {@link LocalDateTime} corresponding to the
     *         latest A record update
     */
    Optional<LocalDateTime> getLatestUpdateTime();
}
