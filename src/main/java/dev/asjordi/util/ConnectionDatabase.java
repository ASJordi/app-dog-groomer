package dev.asjordi.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class ConnectionDatabase {
    
    private static String url = "jdbc:mysql://localhost:3306/petsdb?useTimezone=true&serverTimezone=UTC";
    private static BasicDataSource pool;
    
    private ConnectionDatabase() {}
    
    private static BasicDataSource getInstance() {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(getProps().getProperty("user"));
            pool.setPassword(getProps().getProperty("password"));
            pool.setInitialSize(3);
            pool.setMinIdle(5);
            pool.setMaxIdle(6);
            pool.setMaxTotal(15);
        }
        
        return pool;
    }
    
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
    
    private static Properties getProps() {
        Properties p = new Properties();
        p.setProperty("user", "root");
        p.setProperty("password", "1014");
        return p;
    }
    
}
