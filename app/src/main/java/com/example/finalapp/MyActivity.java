package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    EditText editText_studentid,editText_fullname,editText_address;
    Button button_add,button_view;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        editText_studentid = findViewById(R.id.edittext_studentid);
        editText_fullname = findViewById(R.id.edittext_fullname);
        editText_address = findViewById(R.id.edittext_address);
        button_add = findViewById(R.id.button_add);
        button_view = findViewById(R.id.button_view);


        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringStudentid = editText_studentid.getText().toString();
                String stringFullname = editText_fullname.getText().toString();
                String stringAddress = editText_address.getText().toString();

                if (stringStudentid.length() <=0 || stringFullname.length() <=0 || stringAddress.length() <=0){
                    Toast.makeText(MyActivity.this, "Fill all the Records", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(MyActivity.this);
                    RecordModelClass recordModelClass = new RecordModelClass(stringStudentid, stringFullname,stringAddress);
                    databaseHelperClass.addRecord(recordModelClass);
                    Toast.makeText(MyActivity.this, "Add Record Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });


        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, ViewRecordActivity.class);
                startActivity(intent);
            }
        });


    }
}