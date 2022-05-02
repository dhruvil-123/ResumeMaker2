package com.dhruvil.resumemaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Objective_detail extends AppCompatActivity {

    Button back,save;
    EditText objective_edt;
    public static String objective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective_detail);

        back = findViewById(R.id.back);
        save = findViewById(R.id.save);
        objective_edt = findViewById(R.id.objective);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                objective = objective_edt.getText().toString();

                Toast.makeText(Objective_detail.this, "Your Detail Has Been Saved.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}