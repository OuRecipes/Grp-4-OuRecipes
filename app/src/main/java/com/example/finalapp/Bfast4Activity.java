package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Bfast4Activity extends AppCompatActivity {

    TextView textfour;
    JustifiedTextView justifiedTextViewfour;
    String dummy_textfour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfast4);

        textfour = findViewById(R.id.textfour);
        justifiedTextViewfour = findViewById(R.id.justified_text_viewfour);

        dummy_textfour = getString(R.string.dummy_textfour);
        textfour.setText(dummy_textfour);
    }
}
