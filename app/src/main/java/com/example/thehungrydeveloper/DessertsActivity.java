package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {
    ListView dessertsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        this.dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Savory Truffle Risotto", "Savory Truffle Risotto", 1599),
                new Dish("Spicy Mango Salsa Chicken", "Spicy Mango Salsa Chicken", 899),
        };

        ArrayAdapter<Dish> dessertsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);

        this.dessertsList.setAdapter(dessertsAdapter);
    }
}