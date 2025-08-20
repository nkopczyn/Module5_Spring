package pl.coderslab.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppPersonConfig.class);

        PersonService personService = context.getBean("personService", PersonService.class);
        personService.callPersonRepository();
    }
}
