package com.albert.snow.deepcode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        findViewById(R.id.main_testAspect_btn).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(AppGlobalKt.TAG, "initView main test be click");
            }
        });
    }

}
