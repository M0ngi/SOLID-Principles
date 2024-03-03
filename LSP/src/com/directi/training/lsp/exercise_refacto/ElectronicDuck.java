package com.directi.training.lsp.exercise_refacto;

public class ElectronicDuck extends Duck {
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
