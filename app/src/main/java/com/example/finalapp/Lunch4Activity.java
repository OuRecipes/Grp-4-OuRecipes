package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Lunch4Activity extends AppCompatActivity {

    TextView text4;
    JustifiedTextView justifiedTextView4;
    String dummy_text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch4);

        text4 = findViewById(R.id.text4);
        justifiedTextView4 = findViewById(R.id.justified_text_view4);

        dummy_text4 = getString(R.string.dummy_text4);
        text4.setText(dummy_text4);
    }
}
