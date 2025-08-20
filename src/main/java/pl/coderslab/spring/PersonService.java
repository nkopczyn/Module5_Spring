package pl.coderslab.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    @Autowired //automatyczne wstrzykiwanie zależności
    public PersonRepository personRepoAttribute;

    public void callPersonRepository() {
        personRepoAttribute.personRepoHelloMethod();
    }
}
