package com.example.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static Burger getBurgerById(int burgerID) {
        return burgers.get(burgerID);
    }

    public static ArrayList<Burger> getAllBurgers() {
        return new ArrayList<Burger>((List) Arrays.asList(burgers.values().toArray()));
    }

    private static final HashMap<Integer, Burger> burgers = new HashMap<>();

    static {
        burgers.put(1, new Burger(
                1,
                "Cheese Burger",
                "A legendary combo of 100% Aussie beef, onions, pickle, ketchup, mustard and cheese, all in a soft burger bun.",
                "5",
                R.drawable.cheese_burger
        ));
        burgers.put(2, new Burger(
                2,
                "Quarter Pounder",
                "It's mighty simple, but it works. Take a whole quarter pound* of 100% Aussie beef, then complete the tasty picture with cheese, onions, tangy mustard and pickles. Bet your mouth is watering right now.",
                "6",
                R.drawable.quarter_pounder
        ));

        burgers.put(3, new Burger(
                3,
                "BcChicken",
                "It's the simple things that matter. Like our quality chicken breast, cooked in a seasoned tempura coating. Topped with fresh, Australian-grown lettuce and our exceptional McChicken sauce, between a sesame seed bun, it's hard to beat a classic.",
                "4",
                R.drawable.mc_chicken
        ));

        burgers.put(4, new Burger(
                4,
                "Big Mac",
                "It starts with two 100% Aussie beef patties. Then comes the delicious combination of crisp iceberg lettuce, melting signature cheese, onions and pickles, between a toasted sesame seed bun. And don't forget the McDonald's special sauce!",
                "7",
                R.drawable.big_mac
        ));

        burgers.put(5, new Burger(
                5,
                "Filet-o-Fish",
                "Dive in and enjoy our Filet-o-Fish. Sourced for its succulent and fresh flavour, we cook tender portions of fish and enhance their great taste with zesty tartar sauce and cheese.",
                "4",
                R.drawable.filet_o_fish
        ));

        burgers.put(6, new Burger(
                6,
                "Hamburger",
                "It's simple. 100% Aussie beef, topped with onion, pickles, zesty ketchup and mustard, all on a soft, fluffy bun.",
                "3",
                R.drawable.hamburger
        ));

        burgers.put(7, new Burger(
                7,
                "BcFeast",
                "The McFeast burger is an Australian favourite. A juicy beef patty, cheese, tomato, lettuce, pickles, three sauces all on a classic sesame seed bun.",
                "8",
                R.drawable.mc_feast
        ));

        burgers.put(8, new Burger(
                8,
                "Triple Cheeseburger",
                "Triple the taste. With our 100% Aussie beef, onions, pickle, ketchup, mustard and cheese, all in a soft toasted bun.",
                "7",
                R.drawable.triple_cheeseburger
        ));

        burgers.put(9, new Burger(
                9,
                "Classic Angus",
                "100% Aussie Angus beef, classic cheese, tomato, onions and pickles with mustard and mayo",
                "7",
                R.drawable.classic_angus
        ));

        burgers.put(10, new Burger(
                10,
                "BBQ Chicken",
                "The new BBQ Chicken burger made with 100% Aussie Chicken Breast, BBQ sauce, rasher bacon, crisp lettuce, creamy mayo all on a sesame seed bun. What’s not to love?",
                "6",
                R.drawable.bbq_chicken
        ));

        burgers.put(11, new Burger(
                11,
                "Big Breakkie Burger",
                "It starts with a warm, crisp hash brown, melting cheese, rasher bacon and a freshly cracked egg. Finished with a 100% Aussie beef patty and a generous dollop of BBQ sauce in between a toasted sesame seed bun.",
                "5",
                R.drawable.big_breakkie
        ));

        burgers.put(12, new Burger(
                12,
                "English Muffin",
                "Like it simple? Enjoy a toasted and warm English style muffin, spread with your choice of VEGEMITE or strawberry jam.",
                "3",
                R.drawable.english_muffin
        ));

        burgers.put(13, new Burger(
                13,
                "Hash Brown",
                "Get 'em hot. A crunchy, golden brown crust with steaming, fluffy potato inside.",
                "2",
                R.drawable.hash_brown
        ));

        burgers.put(14, new Burger(
                14,
                "Fries",
                "Get them while they're hot. Our legendary, super-tasty French fries are the perfect side to any meal. We only use the highest quality potatoes to create those delicious strands of crispy fluffiness that you love, now fried in a superior and healthier blend including canola and sunflower oils.",
                "3",
                R.drawable.fries
        ));

        burgers.put(15, new Burger(
                15,
                "Chicken BcNuggets",
                "Everything's better when it's bite-sized. Like our nuggets made with tender juicy 100% Aussie Chicken McNuggets in a crisp tempura coating, with no artificial colours, flavours or preservatives!",
                "10",
                R.drawable.chicken_nuggets
        ));
    }
}
