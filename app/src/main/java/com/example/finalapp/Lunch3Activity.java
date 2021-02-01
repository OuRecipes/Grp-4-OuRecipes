package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Lunch3Activity extends AppCompatActivity {

    TextView text3;
    JustifiedTextView justifiedTextView3;
    String dummy_text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch3);

        text3 = findViewById(R.id.text3);
        justifiedTextView3 = findViewById(R.id.justified_text_view3);

        dummy_text3 = getString(R.string.dummy_text3);
        text3.setText(dummy_text3);
    }
}
