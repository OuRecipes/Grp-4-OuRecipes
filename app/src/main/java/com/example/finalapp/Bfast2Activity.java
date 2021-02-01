package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Bfast2Activity extends AppCompatActivity {

    TextView texttwo;
    JustifiedTextView justifiedTextViewtwo;
    String dummy_texttwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfast2);

        texttwo = findViewById(R.id.texttwo);
        justifiedTextViewtwo = findViewById(R.id.justified_text_viewtwo);

        dummy_texttwo = getString(R.string.dummy_texttwo);
        texttwo.setText(dummy_texttwo);
    }
}
