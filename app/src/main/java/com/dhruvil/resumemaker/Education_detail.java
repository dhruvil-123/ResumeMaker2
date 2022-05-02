package com.dhruvil.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Education_detail extends AppCompatActivity {

    Button back,save;
    EditText course_edt,school_edt,grade_edt,year_edt;
    public  static String course,school,grade,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_detail);

        back = findViewById(R.id.back);
        save = findViewById(R.id.save);
        course_edt = findViewById(R.id.course);
        school_edt = findViewById(R.id.school);
        grade_edt = findViewById(R.id.grade);
        year_edt = findViewById(R.id.year);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                course = course_edt.getText().toString();
                school = school_edt.getText().toString();
                grade = grade_edt.getText().toString();
                year = course_edt.getText().toString();

                Intent intent = new Intent(Education_detail.this,All_Activity.class);

                Toast.makeText(Education_detail.this, "Your Detail Has Been Saved.", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

    }
}