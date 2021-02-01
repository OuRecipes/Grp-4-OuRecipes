package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Salad2Activity extends AppCompatActivity {

    TextView textb;
    JustifiedTextView justifiedTextViewb;
    String dummy_textb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad2);

        textb = findViewById(R.id.textb);
        justifiedTextViewb = findViewById(R.id.justified_text_viewb);

        dummy_textb = getString(R.string.dummy_textb);
        textb.setText(dummy_textb);
    }
}
