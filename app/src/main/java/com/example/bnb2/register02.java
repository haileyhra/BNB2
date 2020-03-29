package com.example.bnb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ResourceBundle;

public class register02 extends AppCompatActivity {

    TextView con;
    private Spinner date;
    private Spinner month;
    private Spinner year;
    private ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register02);
        setViews();
    }

    /*DATE*/
    public void setViews() {
        date = (Spinner) findViewById(R.id.date);
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.date, android.R.layout.simple_spinner_dropdown_item);
        date.setAdapter(arrayAdapter);

        month = (Spinner) findViewById(R.id.month);
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.month, android.R.layout.simple_spinner_dropdown_item);
        month.setAdapter(arrayAdapter);

        year = (Spinner) findViewById(R.id.year);
        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.year, android.R.layout.simple_spinner_dropdown_item);
        year.setAdapter(arrayAdapter);

        con = findViewById(R.id.con);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register02.this, register03.class);
                startActivity(intent);
            }
        });}}


