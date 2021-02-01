package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OurActivity extends AppCompatActivity {
    Button backButton;
    Button bf1,bf2,bf3,bf4,bf5;
    Button l1,l2,l3,l4,l5;
    Button d1,d2,d3,d4,d5;
    Button s1,s2,s3,s4,s5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our);

        s5 = findViewById(R.id.s5);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Salad5Activity.class);
                startActivity(intent);
            }
        });

        s4 = findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Salad4Activity.class);
                startActivity(intent);
            }
        });

        s3 = findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Salad3Activity.class);
                startActivity(intent);
            }
        });

        s2 = findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Salad2Activity.class);
                startActivity(intent);
            }
        });

        s1 = findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Salad1Activity.class);
                startActivity(intent);
            }
        });

        d5 = findViewById(R.id.d5);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Dinner5Activity.class);
                startActivity(intent);
            }
        });

        d4 = findViewById(R.id.d4);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Dinner4Activity.class);
                startActivity(intent);
            }
        });

        d3 = findViewById(R.id.d3);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Dinner3Activity.class);
                startActivity(intent);
            }
        });

        d2 = findViewById(R.id.d2);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Dinner2Activity.class);
                startActivity(intent);
            }
        });

        d1 = findViewById(R.id.d1);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Dinner1Activity.class);
                startActivity(intent);
            }
        });

        l5 = findViewById(R.id.l5);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Lunch5Activity.class);
                startActivity(intent);
            }
        });

        l4 = findViewById(R.id.l4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Lunch4Activity.class);
                startActivity(intent);
            }
        });

        l3 = findViewById(R.id.l3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Lunch3Activity.class);
                startActivity(intent);
            }
        });

        l2 = findViewById(R.id.l2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Lunch2Activity.class);
                startActivity(intent);
            }
        });

        l1 = findViewById(R.id.l1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Lunch1Activity.class);
                startActivity(intent);
            }
        });

        bf5 = findViewById(R.id.bf5);
        bf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Bfast5Activity.class);
                startActivity(intent);
            }
        });

        bf4 = findViewById(R.id.bf4);
        bf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Bfast4Activity.class);
                startActivity(intent);
            }
        });

        bf3 = findViewById(R.id.bf3);
        bf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Bfast3Activity.class);
                startActivity(intent);
            }
        });

        bf2 = findViewById(R.id.bf2);
        bf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Bfast2Activity.class);
                startActivity(intent);
            }
        });

        bf1 = findViewById(R.id.bf1);
        bf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, Bfast1Aactivity.class);
                startActivity(intent);
            }
        });

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OurActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
