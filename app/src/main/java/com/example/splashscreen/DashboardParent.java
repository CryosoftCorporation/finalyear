package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardParent extends AppCompatActivity {

    Button parentlogoutbutton;
    TextView tvnotifyabsent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_parent);

        Button parentlogoutbutton = (Button) findViewById(R.id.parentlogoutbutton);
        TextView tvnotifyabsent = (TextView) findViewById(R.id.tvnotifyabsent);
        TextView tvbusstatus = (TextView) findViewById(R.id.tvbusstatus);

        parentlogoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardParent.this,MainActivity.class);
                startActivity(intent);
            }
        });

        tvnotifyabsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardParent.this,Absentee.class);
                startActivity(intent);
            }
        });
        tvbusstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardParent.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}