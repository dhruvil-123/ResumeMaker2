package com.dhruvil.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Personal_detail extends AppCompatActivity {

    Button back, save;
    EditText name_edt, address_edt, email_edt, mobile_edt,profession_edt;

    public static String name, address, mobile, email, hobby,profession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detail);

        back = findViewById(R.id.back);
        save = findViewById(R.id.save);
        name_edt = findViewById(R.id.name);
        address_edt = findViewById(R.id.address);
        email_edt = findViewById(R.id.email);
        mobile_edt = findViewById(R.id.phone);
        profession_edt = findViewById(R.id.profession);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = name_edt.getText().toString();
                address = address_edt.getText().toString();
                email = email_edt.getText().toString();
                mobile = mobile_edt.getText().toString();
                profession = profession_edt.getText().toString();

                if (name.isEmpty()) {
                    name_edt.setError("Filed can't Empty");
                    name_edt.requestFocus();
                } else if (email.isEmpty()) {
                    email_edt.setError("Filed can't Empty");
                    email_edt.requestFocus();
                } else if (mobile.isEmpty()) {
                    mobile_edt.setError("Filed can't Empty");
                    mobile_edt.requestFocus();
                }else if (profession.isEmpty()) {
                    profession_edt.setError("Filed can't Empty");
                    profession_edt.requestFocus();
                } else {
                    Toast.makeText(Personal_detail.this, "Your Detail Has Been Saved.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Personal_detail.this,All_Activity.class);

                    startActivity(intent);
                }

            }
        });

    }
}