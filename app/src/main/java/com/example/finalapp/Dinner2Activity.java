package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class Dinner2Activity extends AppCompatActivity {

    TextView text22;
    JustifiedTextView justifiedTextView22;
    String dummy_text22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner2);

        text22 = findViewById(R.id.text22);
        justifiedTextView22 = findViewById(R.id.justified_text_view22);

        dummy_text22 = getString(R.string.dummy_text22);
        text22.setText(dummy_text22);
    }
}
