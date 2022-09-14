package com.cookandroid.natno

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText edit1, edit2;
        Button btnAdd, btnSub, btnMul, btnDiv, btnRest;
        TextView textResult;
        String num1, num2;
        Integer result;

        @override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText)findViewById(R.id.Edit1);
        edit2 = (EditText)findViewById(R.id.Edit2);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnRest = (Button)findViewById(R.id.btnRest);
        textResult = (TextView)findViewById(R.id.textResult);

        btnAdd.setOnClickListener() {
        num1 = editNum1.text.toString();
        num2 = editNum2.text.toString();

        if (num1.trim() == "" || num2.trim() == "") {
        Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show();
        } else {
        result = num1.toDouble() + num2.toDouble();
        tvResult.text = "계산 결과 : " + result.toString();
        }
        }
        // 빼기
        btnSub.setOnClickListener {
        // 3-1, EditText의 값을 읽어 온다
        num1 = editNum1.text.toString()
        num2 = editNum2.text.toString()

        if (num1.trim() == "" || num2.trim() == "") {
        Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
        } else {
        // 3-2, 계산
        result = num1.toDouble() - num2.toDouble()
        // 3-3, 계산된 결과를 TextView에 보여준다
        tvResult.text = "계산 결과 : " + result.toString()
        }
        }
        // 곱하기
        btnMul.setOnClickListener {
        // 3-1, EditText의 값을 읽어 온다
        num1 = editNum1.text.toString()
        num2 = editNum2.text.toString()

        if (num1.trim() == "" || num2.trim() == "") {
        Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
        } else {
        // 3-2, 계산
        result = num1.toDouble() * num2.toDouble()
        // 3-3, 계산된 결과를 TextView에 보여준다
        tvResult.text = "계산 결과 : " + result.toString()
        }
        }
        // 나누기
        btnDiv.setOnClickListener{
        // 3-1, EditText의 값을 읽어 온다
        num1=editNum1.text.toString()
        num2=editNum2.text.toString()

        if(num1.trim()==""||num2.trim()==""){
        Toast.makeText(applicationContext,"입력 값이 비었습니다.",Toast.LENGTH_SHORT).show()
        }else{
        if(num2.trim()=="0"){
        Toast.makeText(applicationContext,"0으로 나머지 계산 불가합니다.",Toast.LENGTH_SHORT).show()
        }else{
        // 3-2, 계산
        result=num1.toDouble()/num2.toDouble()
        // 3-3, 계산된 결과를 TextView에 보여준다
        tvResult.text="계산 결과 : "+result.toString()
        }
        }
        }
        btnRest.setOnClickListener {
        // 3-1, EditText의 값을 읽어 온다
        num1 = editNum1.text.toString()
        num2 = editNum2.text.toString()

        if (num1.trim() == "" || num2.trim() == "") {
        Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT).show()
        } else {
        if (num2.trim() == "0") {
        Toast.makeText(applicationContext, "0으로 나머지 계산 불가합니다.", Toast.LENGTH_SHORT).show()
        } else {
        // 3-2, 계산
        result = num1.toDouble() % num2.toDouble()
        // 3-3, 계산된 결과를 TextView에 보여준다
        tvResult.text = "계산 결과 : " + result.toString()
        }
        }
        }
        }
        }