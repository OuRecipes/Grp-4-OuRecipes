package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Bfast5Activity extends AppCompatActivity {

    TextView textfive;
    JustifiedTextView justifiedTextViewfive;
    String dummy_textfive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfast5);

        textfive = findViewById(R.id.textfive);
        justifiedTextViewfive = findViewById(R.id.justified_text_viewfive);

        dummy_textfive = getString(R.string.dummy_textfive);
        textfive.setText(dummy_textfive);
    }
}
