package mighty.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "db.additional-properties")
@ConditionalOnProperty(name = "db.type", havingValue = "mysql")
public class MysqlAdditionalProperties extends AdditionalProperties{
    boolean dumpQueriesOnException;
    int callableStmtCacheSize;
}
