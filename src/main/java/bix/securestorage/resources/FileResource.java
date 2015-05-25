/**
 * 
 */
package bix.securestorage.resources;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.codec.binary.Base64;

import bix.securestorage.db.FileDAO;
import bix.securestorage.model.File;

/**
 * @author Yohan
 *
 */
@Path("/file")
@Produces(MediaType.APPLICATION_JSON)
public class FileResource {

	private FileDAO fileDAO;
	
	public FileResource(FileDAO fileDAO) {
		this.fileDAO = fileDAO;
	}
	
	@GET
    public List<File> load() {
        return fileDAO.getFiles();
    }
	
	@POST
	@Path("/upload")
	public void upload(String content) {
//		TODO: Read "content" 
//		Apply Encription method, String encContent = encrypt(content);
//		
		byte[]   bytesEncoded = Base64.encodeBase64(content.getBytes());
		String encodedString = new String(bytesEncoded);
		System.out.println(">>>>>>>>>>>>");
		System.out.println(encodedString);
		System.out.println(">>>>>>>>>>>>");
		
		fileDAO.createFile(1001, "fileName1001", encodedString);
	}
	
}
