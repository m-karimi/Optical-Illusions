package com.barname_nevis.opticalillusions;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by Mohammad on 8/2/2015.
 */
public class PictureActivity extends FragmentActivity{

    boolean isFavorite = false;
    PictureAdapter mPictureAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictureview);
        Bundle receivedBundle = getIntent().getExtras();
        isFavorite = receivedBundle.getBoolean(MainActivity.IS_IT_FAVORITE);

        mPictureAdapter = new PictureAdapter(getSupportFragmentManager(), this, isFavorite);

        mViewPager = (ViewPager) findViewById(R.id.picture_pager);
        mViewPager.setAdapter(mPictureAdapter);


    }
}
