package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Salad5Activity extends AppCompatActivity {

    TextView texte;
    JustifiedTextView justifiedTextViewe;
    String dummy_texte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad5);

        texte = findViewById(R.id.texte);
        justifiedTextViewe = findViewById(R.id.justified_text_viewe);

        dummy_texte = getString(R.string.dummy_texte);
        texte.setText(dummy_texte);
    }
}
