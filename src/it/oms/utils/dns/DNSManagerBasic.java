package it.oms.utils.dns;

/**
 * Provides a simple and generic tool in order to query and update a generic DNS
 * A record.
 */
public class DNSManagerBasic implements DNSManager {

    /**
     * Creates a new {@link DNSManagerBasic}.
     */
    public DNSManagerBasic() {

    }

    @Override
    public final boolean updateRecord(final String rawURL) {

        return true;
    }
}
