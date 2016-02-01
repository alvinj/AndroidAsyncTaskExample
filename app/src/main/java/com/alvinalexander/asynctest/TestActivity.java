package com.alvinalexander.asynctest;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            // if the screen is in landscape mode, we can show the
//            // dialog in-line with the list so we don't need this activity.
//            finish();
//            return;
//        }

        if (savedInstanceState == null) {
            TestFragment testFragment = new TestFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, testFragment).commit();
        }
    }

}



