package com.markupartist.integrationdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartActivity extends Activity implements OnClickListener {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button sayButton = (Button) findViewById(R.id.say_button);
        sayButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Uri sayUri = Uri.parse(String.format("say://markupartist?what=%s", "It's working!"));
        Intent sayIntent = new Intent(Intent.ACTION_VIEW, sayUri);
        startActivity(sayIntent);
    }
}