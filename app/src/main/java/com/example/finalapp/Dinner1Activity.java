package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Dinner1Activity extends AppCompatActivity {

    TextView text11;
    JustifiedTextView justifiedTextView11;
    String dummy_text11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner1);

        text11 = findViewById(R.id.text11);
        justifiedTextView11 = findViewById(R.id.justified_text_view11);

        dummy_text11 = getString(R.string.dummy_text11);
        text11.setText(dummy_text11);
    }
}
