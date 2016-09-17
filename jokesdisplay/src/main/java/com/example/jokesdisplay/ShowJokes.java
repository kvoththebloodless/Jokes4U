package com.example.jokesdisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokes extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_jokes);
        t = (TextView) findViewById(R.id.joketxt);
        t.setText(getIntent().getStringExtra("joke"));
    }

}
