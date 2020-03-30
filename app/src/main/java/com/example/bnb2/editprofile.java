package com.example.bnb2;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class editprofile extends AppCompatActivity {

    TextView btn_editprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        //Update profile button
        btn_editprofile = findViewById(R.id.btn_editprofile);
        btn_editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(editprofile.this,profile.class);
                startActivity(intent);

            }
        });
    }
    public void onRadioButtonClicked(View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()){
            case R.id.gender_female:
                if(checked)
                    Toast.makeText(getApplicationContext(),"female checked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"female checked", Toast.LENGTH_LONG).show();
                break;
            case R.id.gender_male:
                if(checked)
                    Toast.makeText(getApplicationContext(),"male checked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"male checked", Toast.LENGTH_LONG).show();
                break;
        }





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
                            Intent profileIntent = new Intent(editprofile.this, profile.class);
                            startActivity(profileIntent);
                            break;
                        case R.id.menu2:
                            Intent preferenceIntent = new Intent(editprofile.this, preference.class);
                            startActivity(preferenceIntent);
                            break;
                        case R.id.menu3:
                            Intent settingIntent = new Intent(editprofile.this, setting.class);
                            startActivity(settingIntent);
                        default:
                            break;
                    }
                    return false;
                }
            });

            popup.show();//Popup Menu 보이기
}});}}