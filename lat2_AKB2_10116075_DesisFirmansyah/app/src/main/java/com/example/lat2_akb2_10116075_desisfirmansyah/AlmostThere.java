package com.example.lat2_akb2_10116075_desisfirmansyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostThere extends AppCompatActivity {
    Button btn_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        btn_verify  = findViewById(R.id.btn_verify);
        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify_nav();
            }
        });
    }

    public void verify_nav(){
        Intent intent   = new Intent(this, Verify.class);
        startActivity(intent);
    }
}
