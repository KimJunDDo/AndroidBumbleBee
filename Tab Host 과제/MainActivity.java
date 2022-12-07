package com.cookandroid.tabhost;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    RadioButton rdoRed;
    RadioButton rdoGreen;
    RadioButton rdoBlue;

    Button btnSmall;
    Button btnNormal;
    Button btnBig;

    LinearLayout colorLayout;
    TextView tvColor;
    TextView tvSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("탭호스트 과제");

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tabSpecColor = tabHost.newTabSpec("COLOR").setIndicator("색상");
        tabSpecColor.setContent(R.id.colorLayout);
        tabHost.addTab(tabSpecColor);

        TabHost.TabSpec tabSpecSize = tabHost.newTabSpec("SIZE").setIndicator("크기");
        tabSpecSize.setContent(R.id.sizeLayout);
        tabHost.addTab(tabSpecSize);

        tabHost.setCurrentTab(0);

        rdoRed = (RadioButton) findViewById(R.id.rdoRed);
        rdoBlue = (RadioButton) findViewById(R.id.rdoBlue);
        rdoGreen = (RadioButton) findViewById(R.id.rdoGreen);

        btnSmall = (Button) findViewById(R.id.btnSmall);
        btnNormal = (Button) findViewById(R.id.btnNormal);
        btnBig = (Button) findViewById(R.id.btnBig);

        colorLayout = (LinearLayout) findViewById(R.id.colorLayout);
        tvColor = (TextView) findViewById(R.id.colorView);
        tvSize = (TextView) findViewById(R.id.sizeView);

        rdoRed.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                tvColor.setTextColor(Color.RED);
            }
        });

        rdoGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvColor.setTextColor(Color.GREEN);
            }
        });

        rdoBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvColor.setTextColor(Color.BLUE);
            }
        });

        btnSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSize.setTextSize(40);
            }
        });

        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSize.setTextSize(60);
            }
        });

        btnBig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSize.setTextSize(80);
            }
        });
    }
}