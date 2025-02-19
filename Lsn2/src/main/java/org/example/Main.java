package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car c = context.getBean(Car.class);
        Engin e = context.getBean(Engin.class);

        System.out.println(c);
        System.out.println(e);

    /*Car simpleCar = context.getBean("BMW",Car.class);
        System.out.println(simpleCar.getModel() + " "+ simpleCar.getMode());

        String s = context.getBean(String.class);

        System.out.println(s);*/
    }
}