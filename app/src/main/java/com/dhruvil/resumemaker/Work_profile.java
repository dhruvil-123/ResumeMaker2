package com.dhruvil.resumemaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Work_profile extends AppCompatActivity {

    Button back,save;
    EditText github_edt,linkdin_edt;
    public static String github,linkdin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_profile);

        back = findViewById(R.id.back);
        save = findViewById(R.id.save);
        github_edt = findViewById(R.id.github);
        linkdin_edt = findViewById(R.id.linkdin);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                github = github_edt.getText().toString();
                linkdin = linkdin_edt.getText().toString();

                Toast.makeText(Work_profile.this, "Your Detail Has Been Saved.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}