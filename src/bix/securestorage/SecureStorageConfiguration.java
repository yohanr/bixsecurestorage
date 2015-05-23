/**
 * 
 */
package bix.securestorage;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yohan
 *
 */
public class SecureStorageConfiguration extends Configuration {

    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();


    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
    
}
