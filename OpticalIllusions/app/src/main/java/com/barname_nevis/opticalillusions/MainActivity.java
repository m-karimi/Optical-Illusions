package com.barname_nevis.opticalillusions;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    public static final String IS_IT_FAVORITE = "FavoritePic";

    @Override
    protected void onResume() {
        super.onResume();
        setFont();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: set font
        //TODO: set button margins
        setContentView(R.layout.activity_main);
        setupUiEvent();
        setFont();
    }

    private void setFont() {
        try {

            TextView textView = (TextView) findViewById(R.id.action_bar_title);
            Button buttonSet = (Button) findViewById(R.id.button_setting);
            Button buttonAbout = (Button) findViewById(R.id.button_about);
            Button buttonPic = (Button) findViewById(R.id.button_pics);

            Typeface custom_font = FontCash.get(this);

            textView.setTypeface(custom_font);
            buttonAbout.setTypeface(custom_font);
            buttonSet.setTypeface(custom_font);
            buttonPic.setTypeface(custom_font);
        }
        catch(Exception e)
        {

        }
    }


    private void setupUiEvent() {
        Button picButton= (Button) findViewById(R.id.button_pics);
        picButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPictureActivity(false);
            }
        });
        /* TODO: add favorites
        Button favButton= (Button) findViewById(R.id.button_fav);
        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPictureActivity(true);
            }
        });
        */
        Button settingButton= (Button) findViewById(R.id.button_setting);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSettingActivity();
            }
        });

        Button aboutButton= (Button) findViewById(R.id.button_about);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAboutActivity();
            }
        });

    }

    private void showAboutActivity() {
        Intent intent=new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    private void showSettingActivity() {
        Intent intent=new Intent(this, SettingActivity.class);
        startActivity(intent);
    }

    private void showPictureActivity(boolean isFavorite) {
        try {
            Intent intent = new Intent(this, PrePicture.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean(MainActivity.IS_IT_FAVORITE, isFavorite);
            intent.putExtras(bundle);
            startActivity(intent);

        }catch (Exception e) {
            Log.wtf("showPicture Activity", e.getMessage());
        }
    }


}
