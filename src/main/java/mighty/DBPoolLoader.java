package mighty;


import mighty.config.DatabaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DBPoolLoader {

    @Autowired
    private DatabaseConfiguration database;

    @PostConstruct
    public void init() {
        System.out.println(database);
    }
}
