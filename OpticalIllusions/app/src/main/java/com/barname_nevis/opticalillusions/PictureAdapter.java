package com.barname_nevis.opticalillusions;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mohammad on 8/3/2015.
 */
public class PictureAdapter extends FragmentPagerAdapter {
    String[] mPictureTitlesShort;
    String[] mPictureDescriptions;
    private boolean isFavorite;

    public PictureAdapter(FragmentManager fm, Context context, boolean isFavorite) {
        super(fm);

        Resources resources = context.getResources();
        mPictureTitlesShort = resources.getStringArray(R.array.picture_titles_short);
        mPictureDescriptions = resources.getStringArray(R.array.picture_descriptions);
        this.isFavorite = isFavorite;
    }

    @Override
    public Fragment getItem(int i) {
        Bundle arguments = new Bundle();
        arguments.putString(PictureFragment.COURSE_DESCRIPTIONS, mPictureDescriptions[i]);
        arguments.putInt(PictureFragment.TOP_CARD, translateTopCardIndex(i));

        PictureFragment pictureFragment = new PictureFragment();
        pictureFragment.setArguments(arguments);
        return pictureFragment;
    }

    private int translateTopCardIndex(int i) {
        int resourceId = 0;


            switch (i) {
                case 0:
                    resourceId = R.drawable.no1;
                    break;
                case 1:
                    resourceId = R.drawable.no2;
                    break;
                case 2:
                    resourceId = R.drawable.no3;
                    break;
                case 3:
                    resourceId = R.drawable.no4;
                    break;
                case 4:
                    resourceId = R.drawable.no5;
                    break;
                case 5:
                    resourceId = R.drawable.no6;
                    break;
                case 6:
                    resourceId = R.drawable.no7;
                    break;
                case 7:
                    resourceId = R.drawable.no8;
                    break;
                case 8:
                    resourceId = R.drawable.no9;
                    break;
                case 9:
                    resourceId = R.drawable.no10;
                    break;
                case 10:
                    resourceId = R.drawable.no11;
                    break;
                case 11:
                    resourceId = R.drawable.no12;
                    break;
                case 12:
                    resourceId = R.drawable.no13;
                    break;
                case 13:
                    resourceId = R.drawable.no14;
                    break;
                case 14:
                    resourceId = R.drawable.no15;
                    break;
                case 15:
                    resourceId = R.drawable.no16;
                    break;
                case 16:
                    resourceId = R.drawable.no17;
                    break;
                case 17:
                    resourceId = R.drawable.no18;
                    break;
                case 18:
                    resourceId = R.drawable.no19;
                    break;
                case 19:
                    resourceId = R.drawable.no20;
                    break;
                case 20:
                    resourceId = R.drawable.no21;
                    break;
                case 21:
                    resourceId = R.drawable.no22;
                    break;
                case 22:
                    resourceId = R.drawable.no23;
                    break;
                case 23:
                    resourceId = R.drawable.no24;
                    break;
                case 24:
                    resourceId = R.drawable.no25;
                    break;
                case 25:
                    resourceId = R.drawable.no26;
                    break;
                case 26:
                    resourceId = R.drawable.no27;
                    break;
                case 27:
                    resourceId = R.drawable.no28;
                    break;
                case 28:
                    resourceId = R.drawable.no29;
                    break;
                case 29:
                    resourceId = R.drawable.no30;
                    break;
                case 30:
                    resourceId = R.drawable.no31;
                    break;
                case 31:
                    resourceId = R.drawable.no32;
                    break;
                case 32:
                    resourceId = R.drawable.no33;
                    break;
                case 33:
                    resourceId = R.drawable.no34;
                    break;
                case 34:
                    resourceId = R.drawable.no35;
                    break;
                case 35:
                    resourceId = R.drawable.no36;
                    break;
                case 36:
                    resourceId = R.drawable.no37;
                    break;
                case 37:
                    resourceId = R.drawable.no38;
                    break;
                case 38:
                    resourceId = R.drawable.no39;
                    break;
                case 39:
                    resourceId = R.drawable.no40;
                    break;
                case 40:
                    resourceId = R.drawable.no41;
                    break;
                case 41:
                    resourceId = R.drawable.no42;
                    break;
                case 42:
                    resourceId = R.drawable.no43;
                    break;
                case 43:
                    resourceId = R.drawable.no44;
                    break;
                case 44:
                    resourceId = R.drawable.no45;
                    break;
                case 45:
                    resourceId = R.drawable.no46;
                    break;
                case 46:
                    resourceId = R.drawable.no47;
                    break;
                case 47:
                    resourceId = R.drawable.no48;
                    break;
                case 48:
                    resourceId = R.drawable.no49;
                    break;
                case 49:
                    resourceId = R.drawable.no50;
                    break;
                case 50:
                    resourceId = R.drawable.no51;
                    break;
                case 51:
                    resourceId = R.drawable.no52;
                    break;
                case 52:
                    resourceId = R.drawable.no53;
                    break;
                case 53:
                    resourceId = R.drawable.no54;
                    break;
                case 54:
                    resourceId = R.drawable.no55;
                    break;
                case 55:
                    resourceId = R.drawable.no56;
                    break;
                case 56:
                    resourceId = R.drawable.no57;
                    break;
                case 57:
                    resourceId = R.drawable.no58;
                    break;
                case 58:
                    resourceId = R.drawable.no59;
                    break;
                case 59:
                    resourceId = R.drawable.no60;
                    break;
                case 60:
                    resourceId = R.drawable.no61;
                    break;
                case 61:
                    resourceId = R.drawable.no62;
                    break;
                case 62:
                    resourceId = R.drawable.no63;
                    break;
                case 63:
                    resourceId = R.drawable.no64;
                    break;
                case 64:
                    resourceId = R.drawable.no65;
                    break;
                case 65:
                    resourceId = R.drawable.no66;
                    break;
                case 66:
                    resourceId = R.drawable.no67;
                    break;
                case 67:
                    resourceId = R.drawable.no68;
                    break;
                case 68:
                    resourceId = R.drawable.no69;
                    break;
                case 69:
                    resourceId = R.drawable.no70;
                    break;
                case 70:
                    resourceId = R.drawable.no71;
                    break;
                case 71:
                    resourceId = R.drawable.no72;
                    break;
                case 72:
                    resourceId = R.drawable.no73;
                    break;
                case 73:
                    resourceId = R.drawable.no74;
                    break;
                case 74:
                    resourceId = R.drawable.no75;
                    break;
                case 75:
                    resourceId = R.drawable.no76;
                    break;
                case 76:
                    resourceId = R.drawable.no77;
                    break;
                case 77:
                    resourceId = R.drawable.no78;
                    break;
                case 78:
                    resourceId = R.drawable.no79;
                    break;
                case 79:
                    resourceId = R.drawable.no80;
                    break;
                case 80:
                    resourceId = R.drawable.no81;
                    break;
                case 81:
                    resourceId = R.drawable.no82;
                    break;
                case 82:
                    resourceId = R.drawable.no83;
                    break;
                case 83:
                    resourceId = R.drawable.no84;
                    break;
                case 84:
                    resourceId = R.drawable.no85;
                    break;
                case 85:
                    resourceId = R.drawable.no86;
                    break;
                case 86:
                    resourceId = R.drawable.no87;
                    break;
                case 87:
                    resourceId = R.drawable.no88;
                    break;
                case 88:
                    resourceId = R.drawable.no89;
                    break;
                case 89:
                    resourceId = R.drawable.no90;
                    break;
                case 90:
                    resourceId = R.drawable.no91;
                    break;
                case 91:
                    resourceId = R.drawable.no92;
                    break;
                case 92:
                    resourceId = R.drawable.no93;
                    break;
                case 93:
                    resourceId = R.drawable.no94;
                    break;
                case 94:
                    resourceId = R.drawable.no95;
                    break;
            }

        return resourceId;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mPictureTitlesShort[position];
    }

    @Override
    public int getCount() {

        return mPictureTitlesShort.length;

    }
}
