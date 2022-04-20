package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AdminAdd extends AppCompatActivity {

    Button btnadmsavereg,btnadmclosereg;
    RadioButton radiobtnadmmale,radiobtnadmfemale;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add);

        Button btnadmclosereg = (Button) findViewById(R.id.btnadmclosereg);
        RadioButton radiobtnadmmale = (RadioButton) findViewById(R.id.radiobtnadmmale);
        RadioButton radiobtnadmfemale = (RadioButton) findViewById(R.id.radiobtnadmfemale);

        btnadmclosereg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminAdd.this,DashboardAdmin.class);
                startActivity(intent);
            }
        });
    }
    }