package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Bfast1Aactivity extends AppCompatActivity {

    TextView textone;
    JustifiedTextView justifiedTextViewone;
    String dummy_textone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfast1_aactivity);

        textone = findViewById(R.id.textone);
        justifiedTextViewone = findViewById(R.id.justified_text_viewone);

        dummy_textone = getString(R.string.dummy_textone);
        textone.setText(dummy_textone);
    }
}
