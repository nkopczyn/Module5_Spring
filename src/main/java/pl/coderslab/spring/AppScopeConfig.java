package pl.coderslab.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppScopeConfig {

    @Bean
    public ScopeSingleton singleton() {
        return new ScopeSingleton();
    }

    @Bean
    @Scope("prototype")
    public ScopePrototype prototype() {
        return new ScopePrototype();
    }

}
