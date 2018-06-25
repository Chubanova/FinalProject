package com.example.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LibActivity extends AppCompatActivity {
    TextView mJokeTextView;

    public static final String EXTRA_KEY_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        mJokeTextView = findViewById(R.id.joke);
        if (getIntent().getExtras() != null) {
            mJokeTextView.setText(getIntent().getExtras().getString(EXTRA_KEY_JOKE));
        }

    }
}
