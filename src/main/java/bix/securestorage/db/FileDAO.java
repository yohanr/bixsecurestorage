/**
 * 
 */
package bix.securestorage.db;

import java.util.Date;
import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import bix.securestorage.model.File;
import bix.securestorage.model.FileMapper;

import com.mysql.jdbc.Blob;

/**
 * @author Yohan
 *
 */
public interface FileDAO {
	
	@Mapper(FileMapper.class)
	@SqlQuery("SELECT * FROM file")
	List<File> getFiles();
	
	@SqlUpdate("INSERT INTO file (id, name, content) values (:id, :name, :content)")
	void createFile(@Bind("id") Integer id,@Bind("name") String name, @Bind("content") String content);
}
