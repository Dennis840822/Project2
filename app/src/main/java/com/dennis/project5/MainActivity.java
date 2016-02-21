package com.dennis.project5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Dennis on 2016/2/7.
 * Version 1.0
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtc = (EditText) findViewById(R.id.txtc);
                Intent thing = new Intent(getApplication(),factivity.class);//getApplication()或v.getContext()

                Bundle bundle = new Bundle();//新增一個包包,讓 Intent thing 資料放入這個包包中,才可以傳送資料,不至於遺失資料。
                bundle.putString("TEMPC", txtc.getText().toString());
                thing.putExtras(bundle);
                startActivity(thing);
            }
        });
    }

}
