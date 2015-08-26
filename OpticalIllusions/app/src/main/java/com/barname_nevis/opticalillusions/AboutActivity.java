package com.barname_nevis.opticalillusions;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by Mohammad on 8/2/2015.
 */
public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView textView = (TextView) findViewById(R.id.text_website_address);
        String linkText = "<a href='http://barname-nevis.com'>barname-nevis.com</a>";
        textView.setText(Html.fromHtml(linkText));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(getResources().getColor(R.color.black));
        setFont();
    }

    private void setFont() {
        try {
            TextView textViewTitle = (TextView) findViewById(R.id.action_bar_title);
            TextView textViewAddress = (TextView) findViewById(R.id.text_website_address);
            TextView textViewWebsite = (TextView) findViewById(R.id.text_website);
            TextView textViewProgrammer = (TextView) findViewById(R.id.text_programmer);
            Typeface typeface = FontCash.get(this);

            textViewTitle.setTypeface(typeface);
            textViewAddress.setTypeface(typeface);
            textViewWebsite.setTypeface(typeface);
            textViewProgrammer.setTypeface(typeface);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
