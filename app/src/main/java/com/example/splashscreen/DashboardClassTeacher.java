package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardClassTeacher extends AppCompatActivity {

    Button classteacherlogoutbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_class_teacher);

        Button classteacherlogoutbutton = (Button) findViewById(R.id.classteacherlogoutbutton);

        classteacherlogoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardClassTeacher.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}