package com.test.sixnav;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost mTabHost = getTabHost();

        mTabHost.addTab(mTabHost.newTabSpec("tab_test1").setIndicator("", getResources().getDrawable(R.drawable.ic_home)).setContent(R.id.text_view_1));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test2").setIndicator("", getResources().getDrawable(R.drawable.ic_news)).setContent(R.id.text_view_2));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test3").setIndicator("", getResources().getDrawable(R.drawable.ic_calendar)).setContent(R.id.text_view_3));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test4").setIndicator("", getResources().getDrawable(R.drawable.ic_people)).setContent(R.id.text_view_4));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test5").setIndicator("", getResources().getDrawable(R.drawable.ic_mountain)).setContent(R.id.text_view_5));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test6").setIndicator("", getResources().getDrawable(R.drawable.ic_threedots)).setContent(R.id.text_view_6));

        mTabHost.setCurrentTab(0);
    }
}
