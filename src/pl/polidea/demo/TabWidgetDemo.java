package pl.polidea.demo;

import pl.polidea.customwidget.HorizontalTabActivity;
import pl.polidea.customwidget.HorizontalTabHost;
import pl.polidea.customwidget.HorizontalTabHost.HorizontalTabSpec;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

public class TabWidgetDemo extends HorizontalTabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Resources res = getResources();
        final HorizontalTabHost tabHost = getTabHost();
        final Intent oneIntent = new Intent().setClass(this, ActivityOne.class);
        final HorizontalTabSpec oneSpec = tabHost
                .newTabSpec("One")
                .setIndicator("One", res.getDrawable(R.drawable.ic_tab_artists))
                .setContent(oneIntent);
        tabHost.addTab(oneSpec);
        final Intent twoIntent = new Intent().setClass(this, ActivityTwo.class);
        final HorizontalTabSpec twoSpec = tabHost.newTabSpec("Two")
                .setIndicator("Two").setContent(twoIntent);
        tabHost.addTab(twoSpec);

        final Intent threeIntent = new Intent().setClass(this,
                ActivityThree.class);
        final HorizontalTabSpec threeSpec = tabHost.newTabSpec("Three")
                .setIndicator("Three").setContent(threeIntent);
        tabHost.addTab(threeSpec);

        tabHost.setCurrentTab(2);
    }
}