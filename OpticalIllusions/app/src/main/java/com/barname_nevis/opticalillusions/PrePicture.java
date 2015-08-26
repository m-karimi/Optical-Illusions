package com.barname_nevis.opticalillusions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Mohammad on 8/5/2015.
 */
public class PrePicture extends Activity{

    private static final String FILE_NAME = "isFirstRun";
    @Override
    protected void onResume() {
        super.onResume();
        if(!isFirstRun()) {
            imageViewClick();
            finish();
        }
    }

    private ImageView getImageView() {
        if (imageView == null) {
            imageView = (ImageView) findViewById(R.id.imageView_PrePicture);
        }
        return imageView;
    }

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_prepicture);
            setupImage();
            if(!isFirstRun()) {
                imageViewClick();
                finish();
            }
            setupEventHandler();
        } catch (Exception e) {
            Log.wtf("showPicture Activity", e.getMessage());
        }
    }

    private boolean isFirstRun() {
        try {
            int isFirstRun;
            FileInputStream fos = openFileInput(FILE_NAME);
            isFirstRun = fos.read();
            fos.close();
            return isFirstRun != 1;
        }catch (Exception e)
        {
            Log.wtf("isFirstRun Failed",e.getMessage());
            return true;
        }
    }

    private void saveNoMoreShowMode() {
        try {
            FileOutputStream fos = openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
            fos.write(1);
            fos.close();
        } catch (Exception e) {
            Log.wtf("saveNoMoreShowMode Failed",e.getMessage());
        }
    }

    private void setupImage() {
        imageView = (ImageView) findViewById(R.id.imageView_PrePicture);
        imageView.setImageResource(R.drawable.guid);
    }

    private void setupEventHandler() {
        getImageView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewClick();
            }
        });
    }

    private void imageViewClick() {
        //TODO: Add animation for guide swipe mode
        saveNoMoreShowMode();
        Bundle receivedBundle = getIntent().getExtras();
        boolean isFavorite = receivedBundle.getBoolean(MainActivity.IS_IT_FAVORITE);
        Intent intent = new Intent(this, PictureActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean(MainActivity.IS_IT_FAVORITE, isFavorite);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
