package com.example.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    ListView mainCoursesList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        this.mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {
                new Dish("Savory Truffle Risotto", "Savory Truffle Risotto", 1599),
                new Dish("Spicy Mango Salsa Chicken", "Spicy Mango Salsa Chicken", 899),
        };

        ArrayAdapter<Dish> coursesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

        this.mainCoursesList.setAdapter(coursesAdapter);
    }
}
