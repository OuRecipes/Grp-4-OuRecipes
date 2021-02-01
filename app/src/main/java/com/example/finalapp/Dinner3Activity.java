package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Dinner3Activity extends AppCompatActivity {

    TextView text33;
    JustifiedTextView justifiedTextView33;
    String dummy_text33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner3);

        text33 = findViewById(R.id.text33);
        justifiedTextView33 = findViewById(R.id.justified_text_view33);

        dummy_text33 = getString(R.string.dummy_text33);
        text33.setText(dummy_text33);
    }
}
