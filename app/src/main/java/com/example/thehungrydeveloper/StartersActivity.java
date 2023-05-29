package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    ListView startersList;
    /*String[] dishes = {
            "Savory Truffle Risotto",
            "Spicy Mango Salsa Chicken",
            "Mediterranean Stuffed Bell Peppers",
            "Crispy Parmesan Asparagus",
            "Thai Basil Beef Stir-Fry",
            "Creamy Garlic Shrimp Linguine",
            "Tangy Lemon Herb Salmon",
            "Grilled Portobello Mushroom Burger",
            "Cilantro Lime Quinoa Salad",
            "Honey Sriracha Glazed Wings",
            "Mexican Street Corn Dip",
            "Teriyaki Pineapple Chicken Skewers",
            "BBQ Pulled Pork Sliders",
            "Caprese Stuffed Chicken Breast",
            "Vegetarian Tikka Masala",
            "Chimichurri Steak Tacos",
            "Spinach and Feta Stuffed Mushrooms",
            "Coconut Curry Butternut Squash Soup",
            "Greek Orzo Salad",
            "Chocolate Peanut Butter Brownie Cheesecake"
    };*/
//    Dish[] dishes = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        this.startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Savory Truffle Risotto", "Savory Truffle Risotto", 1599),
                new Dish("Spicy Mango Salsa Chicken", "Spicy Mango Salsa Chicken", 899),
                new Dish("Mediterranean Stuffed Bell Peppers", "Mediterranean Stuffed Bell Peppers", 899),
                new Dish("Crispy Parmesan Asparagus", "Crispy Parmesan Asparagus", 899),
                new Dish("Thai Basil Beef Stir-Fry", "Thai Basil Beef Stir-Fry", 899),
                new Dish("Creamy Garlic Shrimp Linguine", "Creamy Garlic Shrimp Linguine", 899),
                new Dish("Tangy Lemon Herb Salmon", "Tangy Lemon Herb Salmon", 899),
                new Dish("Grilled Portobello Mushroom Burger", "Grilled Portobello Mushroom Burger", 899),
                new Dish("Cilantro Lime Quinoa Salad", "Cilantro Lime Quinoa Salad", 899),
                new Dish("Honey Sriracha Glazed Wings", "Honey Sriracha Glazed Wings", 899),
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<Dish>(this, android.R.layout.simple_list_item_1, dishes);

        this.startersList.setAdapter(dishesAdapter);
    }
}