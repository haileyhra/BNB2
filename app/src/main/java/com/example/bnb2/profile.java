package com.example.bnb2;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class profile extends AppCompatActivity {

    private TextView name;
    private ImageView profile_pic;
    TextView btn_profile;


    //Firebase 로그인한 사용자 정보 알기
    private FirebaseAuth mAuth;
    //프로필 uri이용해 bitmap으로
    Bitmap bitmap;

    public profile() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstaceState) {
        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = mAuth.getCurrentUser();

        View view = inflater.inflate(R.layout.fragment_about_user, container, false);
        ListView search_reservation_list = (ListView) view.findViewById(R.id.search_reservation);
        final ListView user_info_list = (ListView) view.findViewById(R.id.user_info);

    //Round image view
    ImageView user_profile = view.findViewById(R.id.profile_pic)
    Thread mThread = new Thread() {
        @Override
        public void run() {
            try {
                //get PhotoUrl from Login data
                URL url = new URL(user.getPhotoUrl().toString());
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true);
                conn.connect();

                InputStream is = conn.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);
            } catch (MalformedURLException ee) {
                ee.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    };
    mThread.start();

    try {
        mThread.join();
        //변환한 bitmap 적용
        user_profile.setImageBitmap(bitmap);
    } catch (InterruptedException e){
        e.printStackTrace();
    }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);





//Edit Profile button
        btn_profile = findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this,editprofile.class);
                startActivity(intent);

            }
        });

    }}