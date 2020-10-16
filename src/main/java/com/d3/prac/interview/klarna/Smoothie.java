package com.d3.prac.interview.klarna;

import java.util.*;

public class Smoothie {

    public static String ingredients(String order) throws IllegalArgumentException {

        TreeSet<String> ingredients = null;
        if (order.contains(",")) {
            String[] orderArr = order.split(",");
            String item = orderArr[0];

            if (Menu.items.containsKey(item)) {
                ingredients = new TreeSet<>(Menu.items.get(item));

                for (int i = 1; i < orderArr.length; i++) {
                    String choice = orderArr[i].trim();
                    checkOrRemoveIngredients(choice, ingredients);
                }
            } else {
                throw new IllegalArgumentException("Menu Item is not available");
            }
        } else {
            String result = checkOrderWithNoIngredientsProvided(order);
            return result;
        }
        return String.join(",", ingredients);
    }

    private static void checkOrRemoveIngredients(String choice, TreeSet<String> ingredients) throws IllegalArgumentException {
        if (choice.startsWith("-")) {
            String ingredient = choice.substring(1);
            if (ingredients.contains(ingredient)) {
                ingredients.remove(ingredient);
            }
        } else {
            if (!ingredients.contains(choice)) {
                throw new IllegalArgumentException("Ingredient is not available");
            }
        }
    }

    private static String checkOrderWithNoIngredientsProvided(String order) {
        if (Menu.items.containsKey(order)) {
            return String.join(",", new TreeSet<>(Menu.items.get(order)));
        } else {
            throw new IllegalArgumentException("Menu Item is not available");
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println(Smoothie.ingredients("Classic,-strawberry,-peanut"));
        System.out.println(Smoothie.ingredients("Classic"));
        System.out.println(Smoothie.ingredients("Greenie,-green apple,-lime,-avocado,-spinach,-ice"));
        System.out.println(Smoothie.ingredients("Classic,strawberry"));

    }
}

class Menu {

    static HashMap<String, List<String>> items = new HashMap<String, List<String>>() {
        {
            put("Classic", Arrays.asList("strawberry", "banana", "pineapple", "mango", "peach", "honey"));
            put("Freezie", Arrays.asList("blackberry", "blueberry", "black currant", "grape juice", "frozen yoghurt"));
            put("Greenie", Arrays.asList("green apple", "lime", "avocado", "spinach", "ice", "apple juice"));
            put("Just Desserts", Arrays.asList("banana", "ice cream", "choclate", "penaut", "cherry"));
        }
    };
}