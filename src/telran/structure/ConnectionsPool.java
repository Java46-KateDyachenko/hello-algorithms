package telran.structure;

public interface ConnectionsPool {
	/**
	 * adds new connection at beginning of Connection Pool
	 * @param connection
	 * @return true if added otherwise false if connection already exists
	 * in the case the Connection Pool is full the last connection will be removed
	 */
boolean addConnection(Connection connection);

/**
 * return Connection if exists otherwise null
 * moves the connection to beginning of Connection Pool
 * @param id
 * @return
 */
Connection getConnection(int id);

}
