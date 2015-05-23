/**
 * 
 */
package bix.securestorage.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bix.securestorage.db.UserDAO;
import bix.securestorage.model.User;

/**
 * @author Yohan
 *
 */
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
	
	private UserDAO dao;

	public UserResource(UserDAO dao) {
		this.dao = dao;
	}
	
	@GET
    public List<User> load() {
        return dao.getUsers();
    }
	
	@GET
	@Path("/{userid}")
    public User loadUser(@PathParam("userid") int userId) {
        return dao.getUserById(userId);
    }
}
