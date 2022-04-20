package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverAdd extends AppCompatActivity {

    Button btndriversavereg,btndriverclosereg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_add);

        Button btndriverclosereg = (Button) findViewById(R.id.btndriverclosereg);

        btndriverclosereg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DriverAdd.this,DashboardAdmin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}