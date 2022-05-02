package com.dhruvil.resumemaker;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resume1 extends AppCompatActivity {

    TextView email_txt,mobile_txt,address_txt,github_txt,linkdin_txt,name_txt,profession_txt,course_txt,school_txt,edu_year_txt,objective_txt,company_txt,year_txt,job_txt,description_txt,skill1_txt,skill2_txt,skill3_txt,skill4_txt,lang1_txt,c_name_txt,c_weblink_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume1);

        Binding();

        name_txt.setText(Personal_detail.name);
        email_txt.setText(Personal_detail.email);
        mobile_txt.setText(Personal_detail.mobile);
        address_txt.setText(Personal_detail.address);
        profession_txt.setText(Personal_detail.profession);
        course_txt.setText(Education_detail.course);
        school_txt.setText(Education_detail.school);
        year_txt.setText(Education_detail.year);
        company_txt.setText(Experience_detail.company);
        job_txt.setText(Experience_detail.job);
        description_txt.setText(Experience_detail.description);
        year_txt.setText(Experience_detail.year);
        skill1_txt.setText(Skill_detail.skill1);
        skill2_txt.setText(Skill_detail.skill2);
        skill3_txt.setText(Skill_detail.skill3);
        skill4_txt.setText(Skill_detail.skill4);
        objective_txt.setText(Objective_detail.objective);
        github_txt.setText(Work_profile.github);
        linkdin_txt.setText(Work_profile.linkdin);
        c_name_txt.setText(Refrence_detail.c_name);
        c_weblink_txt.setText(Refrence_detail.c_weblink);
//        grade_txt.setText(Education_detail.grade);

    }

    private void Binding() {
        email_txt = findViewById(R.id.email);
        mobile_txt = findViewById(R.id.mobile);
        address_txt = findViewById(R.id.address);
        github_txt = findViewById(R.id.github);
        linkdin_txt = findViewById(R.id.linkdin);
        name_txt = findViewById(R.id.name);
        profession_txt = findViewById(R.id.profession);
        course_txt = findViewById(R.id.course);
        school_txt = findViewById(R.id.school);
        edu_year_txt = findViewById(R.id.edu_year);
        objective_txt = findViewById(R.id.objective);
        company_txt = findViewById(R.id.comapny);
        job_txt = findViewById(R.id.job);
        year_txt = findViewById(R.id.year);
        description_txt = findViewById(R.id.e_summary);
        skill1_txt = findViewById(R.id.skill1);
        skill2_txt = findViewById(R.id.skill2);
        skill3_txt = findViewById(R.id.skill3);
        skill4_txt = findViewById(R.id.skill4);
        lang1_txt = findViewById(R.id.lang1);
        c_name_txt = findViewById(R.id.c_name);
        c_weblink_txt = findViewById(R.id.c_weblink);
    }

}