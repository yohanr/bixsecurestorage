/**
 * 
 */
package bix.securestorage.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

/**
 * @author pradeeppeiris
 *
 */
public class FileMapper implements ResultSetMapper<File>{
	public File map(int index, ResultSet r,StatementContext ctx) throws SQLException {
		return new File(r.getInt("id"), r.getString("name"), r.getDate("credate"));
	}
}
