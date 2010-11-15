package pl.polidea.demo;

import pl.polidea.customwidget.FlexibleTabActivity;
import pl.polidea.customwidget.FlexibleTabHost;
import pl.polidea.customwidget.FlexibleTabHost.FlexibleTabSpec;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

public class TabWidgetDemo extends FlexibleTabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Resources res = getResources();
        final FlexibleTabHost tabHost = getTabHost();
        final Intent oneIntent = new Intent().setClass(this, ActivityOne.class);
        final FlexibleTabSpec oneSpec = tabHost
                .newTabSpec("One")
                .setIndicator("One", res.getDrawable(R.drawable.ic_tab_artists))
                .setContent(oneIntent);
        tabHost.addTab(oneSpec);
        final Intent twoIntent = new Intent().setClass(this, ActivityTwo.class);
        final FlexibleTabSpec twoSpec = tabHost.newTabSpec("Two")
                .setIndicator("Two").setContent(twoIntent);
        tabHost.addTab(twoSpec);

        final Intent threeIntent = new Intent().setClass(this,
                ActivityThree.class);
        final FlexibleTabSpec threeSpec = tabHost.newTabSpec("Three")
                .setIndicator("Three").setContent(threeIntent);
        tabHost.addTab(threeSpec);

        tabHost.setCurrentTab(2);
    }
}