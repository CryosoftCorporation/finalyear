package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentAdd extends AppCompatActivity {

    Button btnparentsavereg,btnparentclose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_add);

        Button btnparentclose = (Button) findViewById(R.id.btnparentclose);

        btnparentclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ParentAdd.this,DashboardAdmin.class);
                startActivity(intent);
            }
        });
    }
}