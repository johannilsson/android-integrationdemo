package com.markupartist.integrationdemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class SayActivity extends Activity {
    //static final String ACTION = "com.markupartist.integrationdemo.SAY";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.say);

        final Uri uri;
        final String sayWhat;
        final TextView sayWhatView = (TextView) findViewById(R.id.say_what);

        uri = getIntent().getData();
        sayWhat = uri.getQueryParameter("what");
        sayWhatView.setText(sayWhat);
    }
}