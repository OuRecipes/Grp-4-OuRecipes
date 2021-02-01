package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Salad3Activity extends AppCompatActivity {

    TextView textc;
    JustifiedTextView justifiedTextViewc;
    String dummy_textc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad3);

        textc = findViewById(R.id.textc);
        justifiedTextViewc = findViewById(R.id.justified_text_viewc);

        dummy_textc = getString(R.string.dummy_textc);
        textc.setText(dummy_textc);
    }
}
