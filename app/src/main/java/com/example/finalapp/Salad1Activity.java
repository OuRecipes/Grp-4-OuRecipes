package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Salad1Activity extends AppCompatActivity {

    TextView texta;
    JustifiedTextView justifiedTextViewa;
    String dummy_texta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad1);

        texta = findViewById(R.id.texta);
        justifiedTextViewa = findViewById(R.id.justified_text_viewa);

        dummy_texta = getString(R.string.dummy_texta);
        texta.setText(dummy_texta);
    }
}
