package com.dennis.project5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Dennis on 2016/2/7.
 * Version 1.0
 */
public class factivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factivity);
        convertTempture();
    }
    private void convertTempture() {
        int c;
        double f;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null)
        {
            c = Integer.parseInt(bundle.getString("TEMPC"));

            f = (9.0*c)/5.0+32.0;

            TextView o =  (TextView)findViewById(R.id.lblOutput);
            o.setText("華氏溫度:" + Double.toString(f));
        }
    }
}
