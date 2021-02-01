package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Lunch5Activity extends AppCompatActivity {

    TextView text5;
    JustifiedTextView justifiedTextView5;
    String dummy_text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch5);

        text5 = findViewById(R.id.text5);
        justifiedTextView5 = findViewById(R.id.justified_text_view5);

        dummy_text5 = getString(R.string.dummy_text5);
        text5.setText(dummy_text5);
    }
}
