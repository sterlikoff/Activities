package ru.sterlikov.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.randTextView);

        int value = (int) Math.round(Math.random() * 100);
        String url = "https://myfile.org/" + Integer.toString(value);
        textView.setText(url);

        Button nextButton = findViewById(R.id.nextButton);
        Button prevButton = findViewById(R.id.prevButton);

        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
                MainActivity.this.startActivity(myIntent);

            }

        });

        prevButton.setOnClickListener(new View.OnClickListener() {

           @Override
            public void onClick(View v) {

               MainActivity.this.finish();

            }

        });


    }
}
