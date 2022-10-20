package com.cookandroid.jickpool5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        EditText et = new EditText(this);
        et.setText("입력해주세요.");

        Button btn = new Button(this);
        btn.setBackgroundColor(Color.rgb(0, 255, 0));
        btn.setText("버튼입니다.");

        TextView tv = new TextView(this);
        tv.setTextColor(Color.rgb(255, 0, 255));
        tv.setTextSize(25);

        baseLayout.addView(et);
        baseLayout.addView(btn);
        baseLayout.addView(tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                str = et.getText().toString();
                tv.setText(str);
            }
        });
    }
}