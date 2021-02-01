package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Dinner5Activity extends AppCompatActivity {

    TextView text55;
    JustifiedTextView justifiedTextView55;
    String dummy_text55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner5);

        text55 = findViewById(R.id.text55);
        justifiedTextView55 = findViewById(R.id.justified_text_view55);

        dummy_text55 = getString(R.string.dummy_text55);
        text55.setText(dummy_text55);
    }
}
