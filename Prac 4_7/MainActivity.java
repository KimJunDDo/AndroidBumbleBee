package com.cookandroid.prac4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-7");

        cb1 = (CheckBox) findViewById(R.id.Cb1);
        cb2 = (CheckBox) findViewById(R.id.Cb2);
        cb3 = (CheckBox) findViewById(R.id.Cb3);

        btn = (Button) findViewById(R.id.Btn);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonEnabled, boolean isChecked) {
                if (cb1.isChecked() == true){
                    btn.setEnabled(true);
                }
                else
                    btn.setEnabled(false);
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonClickabled, boolean isChecked) {
                if (cb2.isChecked() == true){
                    btn.setClickable(true);
                }
                else
                    btn.setClickable(false);
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonRotation, boolean isChecked) {
                if (cb3.isChecked() == true){
                    btn.setRotation(45);
                }
                else
                    btn.setRotation(0);
            }
        });
    }
}