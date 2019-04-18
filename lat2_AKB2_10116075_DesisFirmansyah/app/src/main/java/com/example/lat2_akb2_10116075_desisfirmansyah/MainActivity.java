package com.example.lat2_akb2_10116075_desisfirmansyah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
/*
 * NIM       :  10116075
 * Nama      :  Desis Firmansyah
 * KElas     :  IF-2
 *
 * 13-04-2019 - 14-04-2019
 *
 * membuat login - verify
 *
 *
 * 15-04-2019 - 16-04-2019
 * membuat User Home

 */

public class MainActivity extends AppCompatActivity {
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register    = findViewById(R.id.txt_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register_nav();
            }
        });
    }

    public void register_nav(){
        Intent intent  = new Intent(this, Register.class);
        startActivity(intent);
    }
}
