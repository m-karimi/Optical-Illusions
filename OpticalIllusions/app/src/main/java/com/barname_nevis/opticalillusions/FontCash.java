package com.barname_nevis.opticalillusions;

import android.content.Context;
import android.graphics.Typeface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

/**
 * Created by Mohammad on 8/1/2015.
 */
public class FontCash {


        private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();

        public static Typeface get(Context context) throws IOException {
            String name= "Koodak.ttf" ;
            switch (getFont(context)){
                case 1:
                    name = "Kamran.ttf";
                    break;
                case 2:
                    name = "Koodak.ttf";
                    break;
                case 3:
                    name = "Yekan.ttf";
                    break;

            }
            //Typeface tf = fontCache.get(name);
            //if(tf == null) {
            //    try {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), name);
          //      }
            //    catch (Exception e) {
             //       return null;
             //   }
             //   fontCache.put(name, tf);
           // }
            return tf;
        }

    private static int getFont(Context context) throws IOException {

        int fontIndex;
        String FILENAME = "config";
        FileInputStream fos = context.openFileInput(FILENAME);
        fontIndex = fos.read();
        fos.close();
        return fontIndex;

    }

}
