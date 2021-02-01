package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Lunch2Activity extends AppCompatActivity {

    TextView text2;
    JustifiedTextView justifiedTextView2;
    String dummy_text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch2);

        text2 = findViewById(R.id.text2);
        justifiedTextView2 = findViewById(R.id.justified_text_view2);

        dummy_text2 = getString(R.string.dummy_text2);
        text2.setText(dummy_text2);
    }
}
