package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static final BufferedReader bis = new BufferedReader (new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String input;

        while (true) {
            try {
                input = bis.readLine();
            } catch (IOException e) {
                ConsoleHelper.writeMessage("try again.");
                continue;
            }
            break;
        }

        return input;
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> orderedDishes = new ArrayList<>();
        String input;

        do {
            ConsoleHelper.writeMessage("Select your dishes:");
            ConsoleHelper.writeMessage(Dish.allDishesToString());

            input = bis.readLine().toUpperCase();
            if (input.equals("EXIT")) break;

            switch (input) {
                case "FISH"     : orderedDishes.add(Dish.Fish); break;
                case "STEAK"    : orderedDishes.add(Dish.Steak); break;
                case "SOUP"     : orderedDishes.add(Dish.Soup); break;
                case "JUICE"    : orderedDishes.add(Dish.Juice); break;
                case "WATER"    : orderedDishes.add(Dish.Water); break;
                default         : ConsoleHelper.writeMessage("No such dish available, try again.");
             }

        } while (true);

        if (orderedDishes.size() != 0 ) ConsoleHelper.writeMessage("Order send");
        return orderedDishes;
    }
}
