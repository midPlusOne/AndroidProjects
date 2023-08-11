package com.afnan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNum1 = findViewById(R.id.txtNum1);
        EditText editNum2 = findViewById(R.id.txtNum2);

        TextView txtRes = findViewById(R.id.txtRes);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnClr = findViewById(R.id.btnClr);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());
                int res  = num1 + num2;
                txtRes.setText(" " + res);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());
                int res  = num1 - num2;
                txtRes.setText(" " + res);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());
                int res  = num1 * num2;
                txtRes.setText(" " + res);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());
                int num2 = Integer.parseInt(editNum2.getText().toString());
                double res  = num1 / num2;
                txtRes.setText(" " + res);
            }
        });


        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNum1.getText().clear();
                editNum2.getText().clear();

                txtRes.setText(" ");
            }
        });





    }
}