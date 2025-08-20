package pl.coderslab.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainShip {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppShipConfig.class);
        Ship ship = context.getBean("blackPearl", Ship.class);
        System.out.println(ship.getCaptain().startSailing());

    }
}
