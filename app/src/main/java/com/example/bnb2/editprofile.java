package com.example.bnb2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class editprofile extends AppCompatActivity {

    TextView btn_editprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        btn_editprofile = findViewById(R.id.btn_editprofile);

        btn_editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Editintent = new Intent(editprofile.this,profile.class);
                startActivity(Editintent);
            }
        });
    }
}