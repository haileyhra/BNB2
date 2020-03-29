package com.example.bnb2;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class home02 extends AppCompatActivity {
    ImageView card;
    TextView chooseforme;
    Random r;

    Integer[] images = {
            R.drawable.random01,
            R.drawable.random02,
            R.drawable.random03,
            R.drawable.random04
    };

    int pickedImage = 0, lastPicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home02);

        card = (ImageView)findViewById(R.id.card);
        chooseforme = (TextView)findViewById(R.id.chooseforme);

        r = new Random();

        chooseforme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Remove duplicates
                do {
                    pickedImage = r.nextInt(images.length);
                } while (pickedImage == lastPicked);

                lastPicked = pickedImage;
                //Display image
                card.setImageResource(images[pickedImage]);

            }});

//예쁜 메뉴 스타일
    ImageView menu_button = (ImageView) findViewById(R.id.menu_button);
        menu_button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            PopupMenu popup= new PopupMenu(getApplicationContext(), view);//v는 클릭된 뷰를 의미

            getMenuInflater().inflate(R.menu.main_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.menu1:
                            Intent profileIntent = new Intent(home02.this,profile.class);
                            startActivity(profileIntent);
                            break;
                        case R.id.menu2:
                            Toast.makeText(getApplication(),"메뉴2",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.menu3:
                            Toast.makeText(getApplication(),"메뉴2",Toast.LENGTH_SHORT).show();
                        default:
                            break;
                    }
                    return false;
                }
            });

            popup.show();//Popup Menu 보이기
        }
    });
}}