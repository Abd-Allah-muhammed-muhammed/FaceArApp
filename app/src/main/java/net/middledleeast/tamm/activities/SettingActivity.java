package net.middledleeast.tamm.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import net.middledleeast.tamm.R;
import net.middledleeast.tamm.helper.SharedPreferencesManger;

public class SettingActivity extends AppCompatActivity {
//    private String mLanguageCodeArabic = "ar";
//    private String mLanguageCodeEnglish = "en";

    private Button english,arabic,on,off;
    RelativeLayout toolbar_back1_setting , relative_notification_pass;
    private String guestMode;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        english=findViewById(R.id.btn_english);
        arabic=findViewById(R.id.btn_arabic);

        on=findViewById(R.id.btn_ON);
        off=findViewById(R.id.btn_off);
        guestMode = SharedPreferencesManger.LoadStringData(SettingActivity.this, "guestMode");
        relative_notification_pass=findViewById(R.id.relative_notification_pass);
        toolbar_back1_setting=findViewById(R.id.toolbar_back1_setting);
        toolbar_back1_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingActivity.this,RenewAccount.class);
                startActivity(intent);
            }
        });

//        arabic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LocaleHelper.setLocale(SettingActivity.this, mLanguageCodeArabic);
//                //It is required to recreate the activity to reflect the change in UI.
//                recreate();
//            }
//        });
//
//
//        english.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LocaleHelper.setLocale(SettingActivity.this, mLanguageCodeEnglish);
//
//                //It is required to recreate the activity to reflect the change in UI.
//                recreate();
//            }
//        });


        if (guestMode != null) {

            relative_notification_pass.setVisibility(View.GONE);


        }


        english.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN){

                    english.setBackground(getDrawable(R.color.app_color));
                    english.setTextColor(0xFF000000);
                    english.setTypeface(null, Typeface.BOLD_ITALIC);

                    arabic.setBackground(getDrawable(R.color.float_transparent));
                    arabic.setTextColor(0xFFBE973B);

                }

                return false;
            }
        });



        arabic.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN){

                    arabic.setBackground(getDrawable(R.color.app_color));
                    arabic.setTextColor(0xFF000000);
                    arabic.setTypeface(null, Typeface.BOLD_ITALIC);



                    english.setBackground(getDrawable(R.color.float_transparent));
                    english.setTextColor(0xFFBE973B);
                    english.setTypeface(null, Typeface.SANS_SERIF.getStyle());


                }


                return false;
            }
        });



        on.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN){

                    on.setBackground(getDrawable(R.color.app_color));
                    on.setTextColor(0xFF000000);
                    on.setTypeface(null, Typeface.BOLD_ITALIC);



                    off.setBackground(getDrawable(R.color.float_transparent));
                    off.setTextColor(0xFFBE973B);
                    off.setTypeface(null, Typeface.NORMAL);



                }


                return false;
            }
        });



        off.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN){

                    off.setBackground(getDrawable(R.color.app_color));
                    off.setTextColor(0xFF000000);
                    off.setTypeface(null, Typeface.BOLD_ITALIC);



                    on.setBackground(getDrawable(R.color.float_transparent));
                    on.setTextColor(0xFFBE973B);
                    on.setTypeface(null, Typeface.NORMAL);




                }


                return false;
            }
        });















    }







}
