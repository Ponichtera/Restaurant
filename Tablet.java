package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Order;
import javafx.beans.Observable;

import java.io.IOException;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet implements Observer {
    public final int number;
    public static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public void createOrder() {
        try {
            ConsoleHelper.writeMessage(new Order(this).toString());
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        ConsoleHelper.writeMessage("Start cooking - " + arg);
    }
}
