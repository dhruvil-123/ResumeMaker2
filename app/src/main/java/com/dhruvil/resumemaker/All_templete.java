package com.dhruvil.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class All_templete extends AppCompatActivity {

    Button back;
    ImageView resume1,resume2,resume3,resume4,resume5,resume6,resume7,resume8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_templete);

        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String profession = getIntent().getStringExtra("profession");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String grade = getIntent().getStringExtra("grade");
        String year = getIntent().getStringExtra("year");


        resume1 = findViewById(R.id.resume1);
        resume2 = findViewById(R.id.resume2);
        resume3 = findViewById(R.id.resume3);
        resume4 = findViewById(R.id.resume4);
        resume5 = findViewById(R.id.resume5);
        resume6 = findViewById(R.id.resume6);
        resume7 = findViewById(R.id.resume7);
        resume8 = findViewById(R.id.resume8);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resume1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });
        resume2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });
        resume3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });
        resume4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });
        resume5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });
        resume6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });
        resume7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });
        resume8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_templete.this,Resume1.class);
                startActivity(intent);
            }
        });

    }
}