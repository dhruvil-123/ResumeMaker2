package com.dhruvil.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class All_Activity extends AppCompatActivity {

    Button back, personal, education, experience, skill, objective, work_profile, view_resume,reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

//        String name = getIntent().getStringExtra("name");
//        String address = getIntent().getStringExtra("address");
//        String email = getIntent().getStringExtra("email");
//        String mobile = getIntent().getStringExtra("mobile");
//        String profession = getIntent().getStringExtra("profession");
//        String course = getIntent().getStringExtra("course");
//        String school = getIntent().getStringExtra("school");
//        String grade = getIntent().getStringExtra("grade");
//        String year = getIntent().getStringExtra("year");

        back = findViewById(R.id.back);
        personal = findViewById(R.id.personal);
        education = findViewById(R.id.education);
        experience = findViewById(R.id.experience);
        skill = findViewById(R.id.skill);
        objective = findViewById(R.id.objective);
        work_profile = findViewById(R.id.workprofile);
        view_resume = findViewById(R.id.view_resume);
        reference = findViewById(R.id.reference);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, Personal_detail.class);
                startActivity(intent);
            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, Education_detail.class);
                startActivity(intent);
            }
        });

        experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, Experience_detail.class);
                startActivity(intent);
            }
        });

        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, Skill_detail.class);
                startActivity(intent);
            }
        });

        objective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, Objective_detail.class);
                startActivity(intent);
            }
        });

        work_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, Work_profile.class);
                startActivity(intent);
            }
        });

        reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, Refrence_detail.class);
                startActivity(intent);
            }
        });

        view_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(All_Activity.this, All_templete.class);

//                intent.putExtra("name",name);
//                intent.putExtra("address",address);
//                intent.putExtra("email",email);
//                inent.putExtra("mobile",mobile);
//                intent.putExtra("profession",profession);
//                intent.putExtra("course",course);
//                intent.putExtra("school",school);
//                intent.putExtra("grade",grade);
//                intent.putExtra("year",year);

                startActivity(intent);
            }
        });
    }
}