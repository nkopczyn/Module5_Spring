package pl.coderslab.spring;

import org.springframework.stereotype.Component;

@Component
public class PersonRepository {
    public void personRepoHelloMethod() {
        System.out.println("Hello from person repository class");
    }
}
