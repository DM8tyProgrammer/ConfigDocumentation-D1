package mighty.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "db")
public class DatabaseConfiguration {

    enum DBType {mysql, oracle};

    /**
     * HostName of database
     */
    private String hostname;

    /**
     * Port of database
     */
    private int port;

    /**
     * Authenticated User Name
     */
    private String username;

    /**
     * Password of user
     */
    private String password;

    /**
     * Type of database
     */

    private DBType type;

    /**
     * Additional Database Specific properties
     */
    private AdditionalProperties additionalProperties;
}
