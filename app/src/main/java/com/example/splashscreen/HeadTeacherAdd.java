package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeadTeacherAdd extends AppCompatActivity {

    Button btnheadtchrsavereg,btnheadtchrclosereg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_teacher_add);

        Button btnheadtchrclosereg = (Button) findViewById(R.id.btnheadtchrclosereg);

        btnheadtchrclosereg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeadTeacherAdd.this,DashboardAdmin.class);
                startActivity(intent);
            }
        });
    }
}