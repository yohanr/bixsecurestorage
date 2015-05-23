/**
 * 
 */
package bix.securestorage.db;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import bix.securestorage.model.User;
import bix.securestorage.model.UserMapper;

/**
 * @author Yohan
 *
 */
public interface UserDAO {

	@Mapper(UserMapper.class)
	@SqlQuery("SELECT * FROM user WHERE id = :id")
	User getUserById(@Bind("id") int id);
	
	@Mapper(UserMapper.class)
	@SqlQuery("SELECT * FROM user")
	List<User> getUsers();

}
