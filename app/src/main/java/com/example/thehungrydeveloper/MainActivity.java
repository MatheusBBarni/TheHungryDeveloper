package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findElements();
        this.addListeners();
    }

    private void addListeners() {
        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        this.mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(mainCoursesActivityIntent);
            }
        });
    }

    private void findElements() {
        this.startersCard = findViewById(R.id.card_view_starters);
        this.mainsCard = findViewById(R.id.card_view_mains);
    }
}