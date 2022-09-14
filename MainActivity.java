package com.cookandroid.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button btnNate, btn911, btnGal, btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNate = findViewById(R.id.btnNate);
        btn911 = findViewById(R.id.btn911);
        btnGal = findViewById(R.id.btnGal);
        btnEnd = findViewById(R.id.btnEnd);

        btnNate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                startActivity(mIntent);

            }
        });


        btn911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });

        btnGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }

}