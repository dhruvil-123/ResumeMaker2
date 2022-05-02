package com.dhruvil.resumemaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Skill_detail extends AppCompatActivity {

    Button back,save;
    EditText skill1_edt,skill2_edt,skill3_edt,skill4_edt;
    public static String skill1,skill2,skill3,skill4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_detail);

        back = findViewById(R.id.back);
        save = findViewById(R.id.save);
        skill1_edt = findViewById(R.id.skill1);
        skill2_edt = findViewById(R.id.skill2);
        skill3_edt = findViewById(R.id.skill3);
        skill4_edt = findViewById(R.id.skill4);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                skill1 = skill1_edt.getText().toString();
                skill2 = skill2_edt.getText().toString();
                skill3 = skill3_edt.getText().toString();
                skill4 = skill4_edt.getText().toString();

                Toast.makeText(Skill_detail.this, "Your Detail Has Been Saved.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}