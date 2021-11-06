package com.example.btl_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button btnplay;
    ImageButton btnmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplay = (Button) findViewById(R.id.choigame);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Choigame.class);
                startActivity(intent);
            }
        });

        btnmn = findViewById(R.id.menu);
        btnmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuintent = new Intent(MainActivity.this, Menu.class);
                startActivity(menuintent);
            }
        });
    }
}