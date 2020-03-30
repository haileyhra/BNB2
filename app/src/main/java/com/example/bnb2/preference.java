package com.example.bnb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class preference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);







    //예쁜 메뉴 스타일
    ImageView menu_button = (ImageView) findViewById(R.id.menu_button);
        menu_button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            PopupMenu popup = new PopupMenu(getApplicationContext(), view);//v는 클릭된 뷰를 의미

            getMenuInflater().inflate(R.menu.main_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.menu1:
                            Intent profileIntent = new Intent(preference.this, profile.class);
                            startActivity(profileIntent);
                            break;
                        case R.id.menu2:
                            Intent preferenceIntent = new Intent(preference.this, preference.class);
                            startActivity(preferenceIntent);
                            break;
                        case R.id.menu3:
                            Intent settingIntent = new Intent(preference.this, setting.class);
                            startActivity(settingIntent);
                        default:
                            break;
                    }
                    return false;
                }
            });

            popup.show();//Popup Menu 보이기

        }
    });}}
