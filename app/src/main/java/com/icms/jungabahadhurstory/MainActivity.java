package com.icms.jungabahadhurstory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    ImageView backgroundImg;
    TextView title;
    Button choice1, choice2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroundImg = findViewById(R.id.bgImage);
        title = findViewById(R.id.title);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);


        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateUI();
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateUI();
            }
        });


    }


    void updateUI() {


    }


}