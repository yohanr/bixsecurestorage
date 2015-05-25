/**
 * 
 */
package bix.securestorage.model;

import java.util.Date;

import com.mysql.jdbc.Blob;

/**
 * @author Yohan
 *
 */
public class File {
	
	private int id;
	
	private String name;
	
	private Date credate;
	
	public File(int id, String name, Date credate) {
		this.id = id;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Date getCredate() {
		return credate;
	}

	public void setCredate(Date credate) {
		this.credate = credate;
	}
	
}
