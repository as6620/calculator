package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double num1, num2, ans = 0;
    boolean isNum1Set = false;
    String act = "";
    Button btnPlus, btnMinus, btnKefel, btnDiv, btnClear, btnLastAns;
    EditText eT;
    String st;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = (EditText) findViewById(R.id.eT);
    }

    public void goPlus(View view) {
        st = eT.getText().toString();
        if (!st.isEmpty()){
            if (!isNum1Set) {
                act = "+";
                num1 = Double.parseDouble(st);
                eT.setText("");
                eT.setHint("Enter second number: ");
                isNum1Set = true;
            } else {
                num2 = Double.parseDouble(st);
                ans = num1 + num2;
                eT.setText(String.valueOf(ans));
                isNum1Set = false;
            }
        }
        else
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
    }

    public void goMinos(View view) {
        st = eT.getText().toString();
        if (!st.isEmpty()) {
            if (!isNum1Set) {
                act = "-";
                num1 = Double.parseDouble(st);
                eT.setText("");
                eT.setHint("Enter second number: ");
                isNum1Set = true;
            } else {
                num2 = Double.parseDouble(st);
                ans = num1 - num2;
                eT.setText(String.valueOf(ans));
                isNum1Set = false;
            }
        } else
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
    }

    public void goKefel(View view) {
        st = eT.getText().toString();
        if (!st.isEmpty()) {
            if (!isNum1Set) {
                act = "*";
                num1 = Double.parseDouble(st);
                eT.setText("");
                eT.setHint("Enter second number: ");
                isNum1Set = true;
            } else {
                num2 = Double.parseDouble(st);
                ans = num1 * num2;
                eT.setText(String.valueOf(ans));
                isNum1Set = false;
            }
        } else
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
    }

    public void goDiv(View view) {
        st = eT.getText().toString();
        if (!st.isEmpty()) {
            if (!isNum1Set) {
                act = "/";
                num1 = Double.parseDouble(st);
                eT.setText("");
                eT.setHint("Enter second number: ");
                isNum1Set = true;
            } else {
                num2 = Double.parseDouble(st);
                if (num2 != 0) {
                    ans = num1 / num2;
                    eT.setText(String.valueOf(ans));
                } else
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                isNum1Set = false;
            }
        } else
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
    }

    public void reset(View view) {
        eT.setText("");
        eT.setHint("Enter number: ");
        num1 = 0;
        num2 = 0;
        ans = 0;

    }

    public void goEq(View view) {
        st = eT.getText().toString();
        if (!st.isEmpty()) {
            if (!isNum1Set) {
                num1 = Double.parseDouble(st);
                eT.setText("");
                eT.setHint("Enter second number: ");
                isNum1Set = true;
            } else {
                num2 = Double.parseDouble(st);
                switch (act) {
                    case "+":
                        ans = num1 + num2;
                        break;
                    case "-":
                        ans = num1 - num2;
                        break;
                    case "*":
                        ans = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0)
                            ans = num1 / num2;
                        else {
                            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        break;
                }
                eT.setText(String.valueOf(ans));
                isNum1Set = false;
            }
        } else
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
    }


    public void go(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        si.putExtra("last_answer", String.valueOf(ans));
        startActivity(si);
    }
}