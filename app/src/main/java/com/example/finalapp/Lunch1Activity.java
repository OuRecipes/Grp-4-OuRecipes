package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Lunch1Activity extends AppCompatActivity {

    TextView text1;
    JustifiedTextView justifiedTextView1;
    String dummy_text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch1);

        text1 = findViewById(R.id.text1);
        justifiedTextView1 = findViewById(R.id.justified_text_view1);

        dummy_text1 = getString(R.string.dummy_text1);
        text1.setText(dummy_text1);
    }
}
