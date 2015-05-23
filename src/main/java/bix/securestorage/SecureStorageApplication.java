/**
 * 
 */
package bix.securestorage;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.skife.jdbi.v2.DBI;

import bix.securestorage.db.UserDAO;
import bix.securestorage.resources.SecureStorageResource;
import bix.securestorage.resources.UserResource;

/**
 * @author Yohan
 *
 */
public class SecureStorageApplication extends Application<SecureStorageConfiguration> {

	public static void main(String[] args) throws Exception {
        new SecureStorageApplication().run(args);
    }
	
	@Override
	public void initialize(Bootstrap<SecureStorageConfiguration> bootstrap) {
        
        bootstrap.addBundle(new AssetsBundle());
//		bootstrap.addBundle(new AssetsBundle("/assets/", "/"));
        
	}
	
	@Override
	public void run(SecureStorageConfiguration configuration,
			Environment environment) throws Exception {
		final DBIFactory factory = new DBIFactory();
	    final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
	    final UserDAO dao = jdbi.onDemand(UserDAO.class);
	    
		final SecureStorageResource resource = new SecureStorageResource(dao);
		environment.jersey().register(resource);
		
		final UserResource userResource = new UserResource(dao);
		environment.jersey().register(userResource);
		
	}

}
