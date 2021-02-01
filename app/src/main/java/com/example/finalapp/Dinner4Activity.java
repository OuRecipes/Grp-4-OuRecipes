package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Dinner4Activity extends AppCompatActivity {

    TextView text44;
    JustifiedTextView justifiedTextView44;
    String dummy_text44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner4);

        text44 = findViewById(R.id.text44);
        justifiedTextView44 = findViewById(R.id.justified_text_view44);

        dummy_text44 = getString(R.string.dummy_text44);
        text44.setText(dummy_text44);
    }
}
