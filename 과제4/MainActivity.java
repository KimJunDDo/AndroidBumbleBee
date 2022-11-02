package com.cookandroid.hw;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("동물 선택 대화상자");

        final Button button1 = (Button) findViewById(R.id.button1);
        final ImageView img1 = (ImageView) findViewById(R.id.img1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] animalArray = new String[] {"강아지", "고양이", "말", "토끼"};

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("좋아하는 동물은?");
                dlg.setItems(animalArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                                img1.setImageResource(R.drawable.dog);
                                break;
                            case 1:
                                img1.setImageResource(R.drawable.cat);
                                break;
                            case 2:
                                img1.setImageResource(R.drawable.horse);
                                break;
                            case 3:
                                img1.setImageResource(R.drawable.rabbit);
                                break;
                        }
                    }
                });
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}