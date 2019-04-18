package com.example.lat2_akb2_10116075_desisfirmansyah;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

@SuppressLint("Registered")
class Register extends AppCompatActivity {
    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_register    =  findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almost_there_nav();
            }
        });
    }

    public void almost_there_nav(){
        Intent intent   = new Intent(this, AlmostThere.class);
        startActivity(intent);
    }
}
