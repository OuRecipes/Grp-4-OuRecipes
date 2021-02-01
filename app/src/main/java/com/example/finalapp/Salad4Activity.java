package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Salad4Activity extends AppCompatActivity {

    TextView textd;
    JustifiedTextView justifiedTextViewd;
    String dummy_textd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad4);

        textd = findViewById(R.id.textd);
        justifiedTextViewd = findViewById(R.id.justified_text_viewd);

        dummy_textd = getString(R.string.dummy_textd);
        textd.setText(dummy_textd);
    }
}
