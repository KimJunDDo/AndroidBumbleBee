package com.cookandroid.using_requestcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("Third 액티비티");

        Bundle extras = getIntent().getExtras();
        final int value = extras.getInt("NUM1", 0) * extras.getInt("NUM2", 0);

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("RESULT", value);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });
    }
}
