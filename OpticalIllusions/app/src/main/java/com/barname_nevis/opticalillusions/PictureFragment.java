package com.barname_nevis.opticalillusions;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mohammad on 8/3/2015.
 */
public class PictureFragment extends Fragment {
    public final static String COURSE_TITLE = "course title";
    public final static String COURSE_DESCRIPTIONS = "course description";
    public final static String TOP_CARD = "top card";
    public final static String COURSE_TYPE_LOGO = "course type logo";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {

            TextView textView = (TextView) getActivity().findViewById(R.id.textView);

            Typeface custom_font = FontCash.get(getActivity());
            textView.setTypeface(custom_font);


        }
        catch(Exception e)
        {

        }
        View theView = inflater.inflate(R.layout.fragment_picture, container, false);

        Bundle arguments = getArguments();
        if (arguments != null) {
            String courseTitle = arguments.getString(COURSE_TITLE);
            String courseDescription = arguments.getString(COURSE_DESCRIPTIONS);
            int topCardResourceId = arguments.getInt(TOP_CARD);
            int courseTypeLogoResourceId = arguments.getInt(COURSE_TYPE_LOGO);

            displayValues(theView, courseTitle, courseDescription,
                    topCardResourceId, courseTypeLogoResourceId);

        }
        return theView;
    }

    private void displayValues(View theView, String courseTitle,
                               String courseDescription, int topCardResourceId, int courseTypeLogoResourceId) {

        TextView courseDescriptionTextView = (TextView) theView.findViewById(R.id.textView);
        ImageView topCardImageView = (ImageView) theView.findViewById(R.id.imageView);



        courseDescriptionTextView.setText(courseDescription);

        topCardImageView.setImageResource(topCardResourceId);

    }
}
