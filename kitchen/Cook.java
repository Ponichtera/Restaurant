package com.javarush.task.task27.task2712.kitchen;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Cook implements Observable {
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }
}
