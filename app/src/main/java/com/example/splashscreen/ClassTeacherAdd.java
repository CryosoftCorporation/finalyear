package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClassTeacherAdd extends AppCompatActivity {

    Button btnclasstchrsavereg,btnclasstchrclosereg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_teacher_add);

        Button btnclasstchrclosereg = (Button) findViewById(R.id.btnclasstchrclosereg);

        btnclasstchrclosereg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassTeacherAdd.this,DashboardAdmin.class);
                startActivity(intent);
            }
        });
    }
}