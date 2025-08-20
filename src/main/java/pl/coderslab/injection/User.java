package pl.coderslab.injection;

import java.time.LocalDateTime;

public class User {
    private String name;
    private Logger logger;

    public User(String name, Logger logger) {
        this.name = name;
        this.logger = logger;
    }

    public void logIn() {
        String logInInfo = String.format("%s %s", this.name, LocalDateTime.now());
        logger.log(logInInfo);
    }

}
