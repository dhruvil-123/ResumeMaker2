package com.dhruvil.resumemaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Refrence_detail extends AppCompatActivity {


    Button save,back;
    EditText c_name_edt,c_weblink_edt;
    public static String c_name,c_weblink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrence_detail);

        save = findViewById(R.id.save);
        back = findViewById(R.id.back);
        c_name_edt = findViewById(R.id.comapny_name);
        c_weblink_edt = findViewById(R.id.c_weblink);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c_name = c_name_edt.getText().toString();
                c_weblink = c_weblink_edt.getText().toString();

                Toast.makeText(Refrence_detail.this, "Your Detail Has Been Saved.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}