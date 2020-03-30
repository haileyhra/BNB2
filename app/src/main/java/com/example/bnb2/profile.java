package com.example.bnb2;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;



public class profile extends AppCompatActivity {

    TextView btn_profile;

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
                            Intent profileIntent = new Intent(profile.this, profile.class);
                            startActivity(profileIntent);
                            break;
                        case R.id.menu2:
                            Intent preferenceIntent = new Intent(profile.this, preference.class);
                            startActivity(preferenceIntent);
                            break;
                        case R.id.menu3:
                            Intent settingIntent = new Intent(profile.this, setting.class);
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