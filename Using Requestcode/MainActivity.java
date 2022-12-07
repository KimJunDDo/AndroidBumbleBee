package com.cookandroid.using_requestcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int OP_PLUS = 1, OP_MUL = 2;
    EditText edtNum1, edtNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
    }
    public void onClick(View view) {
        Intent intent = null;
        int num1 = Integer.parseInt(edtNum1.getText().toString());
        int num2 = Integer.parseInt(edtNum2.getText().toString());
        switch (view.getId()) {
            case R.id.btnAdd:
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("NUM1", num1);
                intent.putExtra("NUM2", num2);
                startActivityForResult(intent, OP_PLUS);
                break;
            case R.id.btnMulti:
                intent = new Intent(getApplicationContext(), ThirdActivity.class);
                intent.putExtra("NUM1", num1);
                intent.putExtra("NUM2", num2);
                startActivityForResult(intent, OP_MUL);
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == OP_PLUS && resultCode == RESULT_OK) {
            Toast.makeText(getApplicationContext(), "더하기 액티비티 결과 = " + data.getIntExtra("RESULT", 0),
                    Toast.LENGTH_SHORT).show();
        }
        else if (requestCode == OP_MUL && resultCode == RESULT_OK) {
            Toast.makeText(getApplicationContext(), "곱하기 액티비티 결과 = " + data.getIntExtra("RESULT", 0),
                    Toast.LENGTH_SHORT).show();
        }
    }
}