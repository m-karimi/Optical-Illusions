package com.barname_nevis.opticalillusions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Mohammad on 8/2/2015.
 */
public class SettingActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setupUiEvent();
        setFont();
    }

    private void setFont() {
        RadioButton radioKoodak = (RadioButton) findViewById(R.id.koodak);
        RadioButton radioKamran = (RadioButton) findViewById(R.id.kamran);
        RadioButton radioYekan = (RadioButton) findViewById(R.id.yekan);
        TextView textView = (TextView) findViewById(R.id.action_bar_title);
        TextView textViewfont = (TextView) findViewById(R.id.choose_font);
        Button button = (Button) findViewById(R.id.save_setting);

        try {
            Typeface typeface=FontCash.get(this);

            textView.setTypeface(typeface);
            textViewfont.setTypeface(typeface);
            radioKoodak.setTypeface(typeface);
            radioKamran.setTypeface(typeface);
            radioYekan.setTypeface(typeface);
            button.setTypeface(typeface);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupUiEvent() {
        Button saveButton = (Button) findViewById(R.id.save_setting);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeToFile();
            }
        });
    }

    private void writeToFile() {
        try {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radios);
            int id = radioGroup.getCheckedRadioButtonId();
            int selected = -1;
            switch (id) {
                case R.id.kamran:
                    selected = 1;
                    break;
                case R.id.koodak:
                    selected = 2;
                    break;
                case R.id.yekan:
                    selected = 3;
                    break;
            }
            if (selected != -1) {
                String FILENAME = "config";

                FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
                fos.write(selected);
                fos.close();
            }

        } catch (Exception e) {
            RadioButton button = (RadioButton) findViewById(R.id.yekan);
            button.setText(e.getMessage());
        }
        finish();
    }



}
