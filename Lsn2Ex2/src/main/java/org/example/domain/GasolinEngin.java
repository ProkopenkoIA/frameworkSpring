package org.example.domain;

import org.springframework.stereotype.Component;

@Component
public class GasolinEngin implements iEngin{
    @Override
    public void startEngine() {
        System.out.println("Запущен бензин");
    }
}
