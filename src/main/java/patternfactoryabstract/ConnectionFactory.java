package patternfactoryabstract;

import patternfactoryabstract.creators.ConnectionCreator;
import patternfactoryabstract.products.Connection;

/**
 * Class.
 */
public class ConnectionFactory {
    /**
     * Constructor.
     */
    ConnectionFactory() {
    }

    /**
     * @param myConnectionCreator Type Creator.
     * @return Connection.
     */
    Connection createConnection(final ConnectionCreator myConnectionCreator) {
        return myConnectionCreator.createConnection();
    }
}
