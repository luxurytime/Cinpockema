package com.c9.cinpockema.adapter;

import com.c9.cinpockema.activity.CinemaFragment;
import com.c9.cinpockema.R;
import com.c9.cinpockema.activity.MovieFragment;
import com.c9.cinpockema.activity.MyselfFragment;

/**
 * Created by marionette on 2016/5/25.
 */
public class TabDb {
    public static String[] getTabsText() {
        String[] tabsText = {"电影","影院","我的"};
        return tabsText;
    }
    public static int[] getTabsImgNormal() {
        int[] imgId = {R.drawable.foot_news_normal,R.drawable.foot_fond_normal,R.drawable.foot_out_normal};
        return imgId;
    }
    public static int[] getTabImgLight() {
        int[] imgId = {R.drawable.foot_news_light, R.drawable.foot_found_light,R.drawable.foot_out_light};
        return imgId;
    }
    public static Class[] getContentFragments() {
        Class[] contentFragments = {MovieFragment.class, CinemaFragment.class, MyselfFragment.class};
        return contentFragments;
    }
}
