package com.dhruvil.resumemaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Experience_detail extends AppCompatActivity {

    Button back,save;
    EditText company_edt,job_edt,description_edt,year_edt;
    public static String company,job,description,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience_detail);

        back = findViewById(R.id.back);
        save = findViewById(R.id.save);
        company_edt = findViewById(R.id.comapny_name);
        job_edt = findViewById(R.id.job);
        description_edt = findViewById(R.id.description);
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

                company = company_edt.getText().toString();
                job = job_edt.getText().toString();
                description = description_edt.getText().toString();
                year = year_edt.getText().toString();

                Toast.makeText(Experience_detail.this, "Your Detail Has Been Saved.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}