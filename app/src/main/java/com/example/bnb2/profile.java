package com.example.bnb2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import android.graphics.Bitmap;

import android.graphics.BitmapFactory;

import android.os.Bundle;

/*
import android.support.v4.app.Fragment;
*/

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ListView;

import android.widget.TextView;


/*
import com.github.siyamed.shapeimageview.CircularImageView;
*/

import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

import java.io.InputStream;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.ArrayList;

public class profile extends AppCompatActivity {

    private TextView name;
    private ImageView profile_pic;
    TextView btn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btn_profile = findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this,editprofile.class);
                startActivity(intent);

            }
        });

    }}