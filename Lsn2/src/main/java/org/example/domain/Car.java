package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
private String model = "BMW";
private String mode = "X1";
@Autowired
private Engin typeEngin;


    public Car() {
        System.out.println("Авто создан");
    }

    public Engin getTypeEngin() {
        return typeEngin;
    }

    public void setTypeEngin(Engin typeEngin) {
        this.typeEngin = typeEngin;
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
                ", mode='" + mode + '\'' +
                ", typeEngin=" + typeEngin +
                '}';
    }
}


