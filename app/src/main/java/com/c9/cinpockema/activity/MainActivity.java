package com.c9.cinpockema.activity;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import com.c9.cinpockema.adapter.TabDb;
import com.c9.cinpocketma.R;

public class MainActivity extends FragmentActivity implements TabHost.OnTabChangeListener,View.OnClickListener {


    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        tabHost = (FragmentTabHost) findViewById(R.id.tabHost);
        tabHost.setup(this, this.getSupportFragmentManager(), R.id.contentLayout);
        tabHost.getTabWidget().setDividerDrawable(null);
        tabHost.setOnTabChangedListener(this);
        initTab();
    }

    //初始化底部栏状态
    private void initTab() {
        String tabs[] = TabDb.getTabsText();
        for(int i = 0; i < tabs.length; i++) {
            TabHost.TabSpec tabSpec = tabHost.newTabSpec(tabs[i]).setIndicator(getTabView(i));
            tabHost.addTab(tabSpec, TabDb.getContentFragments()[i],null);
            tabHost.setTag(i);
        }
    }


    //tab切换
    @Override
    public void onTabChanged(String tabId) {
        Log.v("tag id is:", tabId);
        updateTab();
    }

    //更新tab
    private void updateTab() {
        TabWidget tabWidget = tabHost.getTabWidget();
        for(int i = 0; i < tabWidget.getChildCount(); i++) {
            View view = tabWidget.getChildAt(i);
            ImageView imageView = (ImageView) view.findViewById(R.id.tabImg);
            TextView textView = (TextView) view.findViewById(R.id.tabText);
            if (i == tabHost.getCurrentTab()) {
                textView.setTextColor(Color.RED);
                imageView.setImageResource(TabDb.getTabImgLight()[i]);
            } else {
                textView.setTextColor(Color.GRAY);
                imageView.setImageResource(TabDb.getTabsImgNormal()[i]);
            }
        }

    }


    //获得每个底部栏标签的视图
    private View getTabView(int index) {
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.footer_tabs,null);
        TextView textView = (TextView) view.findViewById(R.id.tabText);
        ImageView imageView = (ImageView) view.findViewById(R.id.tabImg);
        textView.setText(TabDb.getTabsText()[index]);
        //初始化操作，默认选择第一个底部栏标签
        if (index == 0) {
            textView.setTextColor(Color.RED);
            imageView.setImageResource(TabDb.getTabImgLight()[index]);
        } else {
            textView.setTextColor(Color.GRAY);
            imageView.setImageResource(TabDb.getTabsImgNormal()[index]);
        }
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            default:
                break;
        }
    }
}
