package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Bfast3Activity extends AppCompatActivity {

    TextView textthree;
    JustifiedTextView justifiedTextViewthree;
    String dummy_textthree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfast3);

        textthree = findViewById(R.id.textthree);
        justifiedTextViewthree = findViewById(R.id.justified_text_viewthree);

        dummy_textthree = getString(R.string.dummy_textthree);
        textthree.setText(dummy_textthree);

    }
}
