package pl.polidea.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button original = (Button) findViewById(R.id.OriginalButton);
        final Button theMissing = (Button) findViewById(R.id.TheMissingButton);
        original.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                final Intent myIntent = new Intent(MainActivity.this,
                        OriginalTabWidgetDemo.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        theMissing.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                final Intent myIntent = new Intent(MainActivity.this,
                        TheMissingTabWidgetDemo.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}
