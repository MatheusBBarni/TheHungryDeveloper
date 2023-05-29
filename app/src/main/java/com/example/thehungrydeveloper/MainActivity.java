package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;
    TextView emailAddressText;

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

        this.emailAddressText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailIntent = new Intent(Intent.ACTION_SENDTO);
                System.out.println("mailto:"+emailAddressText.getText().toString());
                launchEmailIntent.setData(Uri.parse("mailto:"+emailAddressText.getText().toString()));

                startActivity(launchEmailIntent);
            }
        });

        this.dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);

                startActivity(dessertsActivityIntent);
            }
        });
    }

    private void findElements() {
        this.startersCard = findViewById(R.id.card_view_starters);
        this.mainsCard = findViewById(R.id.card_view_mains);
        this.dessertsCard = findViewById(R.id.card_view_desserts);
        this.emailAddressText = findViewById(R.id.text_view_email_address);
    }
}