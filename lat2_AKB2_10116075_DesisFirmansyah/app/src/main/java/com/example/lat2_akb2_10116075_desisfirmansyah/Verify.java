package com.example.lat2_akb2_10116075_desisfirmansyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verify extends AppCompatActivity {
    Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        btn_send    = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_home_nav();
            }
        });
    }

    public void user_home_nav(){
        Intent intent   = new Intent(this, UserHome.class);
        startActivity(intent);
    }
}
