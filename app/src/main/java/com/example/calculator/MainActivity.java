package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnPlus, btnMinus, btnKefel, btnDiv, btnClear, btnLastAns;
    EditText eT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinos);
        btnKefel = (Button) findViewById(R.id.btnKefel);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnLastAns = (Button) findViewById(R.id.btnLastAns);

        eT = (EditText) findViewById(R.id.eT);
    }
}