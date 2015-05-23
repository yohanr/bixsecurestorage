/**
 * 
 */
package bix.securestorage.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bix.securestorage.db.UserDAO;
import bix.securestorage.model.User;

/**
 * @author Yohan
 *
 */
@Path("/secure-storage")
@Produces(MediaType.APPLICATION_JSON)
public class SecureStorageResource {

	private UserDAO dao;
	
	public SecureStorageResource(UserDAO dao) {
		this.dao = dao;
	}
	
	@GET
    public User sayHello() {
        return dao.getUserById(100);
    }
	
}
