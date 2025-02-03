package org.example.config;


import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.beans.BeanProperty;

@Configuration
@ComponentScan(basePackages = "org.example.domain")
public class ProjectConfig {

 /*   @Bean
    Engin engin1() {
        Engin engin = new Engin();
        engin.setTypeEngin("Дизель");
        return engin;
    }
    @Bean
    Engin engin() {
        Engin engin = new Engin();
        return engin;
    }
    @Bean
    Car car(@Qualifier("engin1") Engin eng){
   //  У класса кар нужно создать конструктор от Энджин
        Car obCar = new Car(engin1());
        obCar.setModel("H7");
        obCar.setMode("HAVAL");
        //obCar.setTypeEngin(eng);
        return obCar;
    }

    @Bean
    String hello(){
        return "hello";
    }
*/
}
