package com.example.bnb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class register extends AppCompatActivity {
    TextView con;
    TextView back_to_log;
    ImageView back_to_log_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        con = findViewById(R.id.con);
        con.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(register.this, register02.class);
            startActivity(intent);

        back_to_log = findViewById(R.id.back_to_log);
        back_to_log.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent backintent = new Intent(register.this, MainActivity.class);
            startActivity(backintent);

        back_to_log_arrow = findViewById(R.id.back_to_log_arrow);
        back_to_log_arrow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent backintent1 = new Intent(register.this, MainActivity.class);
            startActivity(backintent1);
        }
    });}}
    );}}
    );}
}