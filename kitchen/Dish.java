package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    Fish, Steak, Soup, Juice, Water;
    public static String allDishesToString() {
        StringBuilder sb = new StringBuilder();
        for(Dish dish : Dish.values()) sb = sb.append(dish).append(", ");

        sb.delete(sb.length()-2, sb.length()).append(".");
        return sb.toString();
    }
}
