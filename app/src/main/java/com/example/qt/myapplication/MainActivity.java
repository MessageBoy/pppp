package com.example.qt.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.text)
    TextView text;
    @InjectView(R.id.activity_main)
    RelativeLayout activityMain;
    @InjectView(R.id.nih)
    TextView nih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.text, R.id.activity_main})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text:
                break;
            case R.id.activity_main:
                break;
        }
    }
}
