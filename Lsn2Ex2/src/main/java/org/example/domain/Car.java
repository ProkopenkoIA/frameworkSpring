package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
private String model = "BMW";
private String mode = "X1";
@Autowired
private iEngin typeEngin;


    public Car(iEngin engin) {
        this.typeEngin = engin;
    }

    public iEngin getTypeEngin() {
        return typeEngin;
    }

    public void setTypeEngin(iEngin typeEngin) {
        this.typeEngin = typeEngin;
        System.out.println("Авто создан");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mode='" + mode + '\''+
                '}';
    }

    public void go(){
        typeEngin.startEngine();
    }
}


