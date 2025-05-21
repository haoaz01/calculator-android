package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_A = findViewById(R.id.edittext_InputA);
        EditText et_B = findViewById(R.id.edittext_InputB);
        Button btn_Sum = findViewById(R.id.buttonSum);
        Button btn_Difference = findViewById(R.id.buttonDifference);
        Button btn_Product = findViewById(R.id.buttonProduct);
        Button btn_Quotient = findViewById(R.id.buttonQuotient);
        TextView tv_Result = findViewById(R.id.textview_Result);
        btn_Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_A.getText().toString());
                int b = Integer.parseInt(et_B.getText().toString());
                tv_Result.setText((a + b)+ "");
            }
        });
        btn_Difference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_A.getText().toString());
                int b = Integer.parseInt(et_B.getText().toString());
                tv_Result.setText((a - b)+ "");
            }
        });
        btn_Product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_A.getText().toString());
                int b = Integer.parseInt(et_B.getText().toString());
                tv_Result.setText((a * b)+ "");
            }
        });
        btn_Quotient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et_A.getText().toString());
                int b = Integer.parseInt(et_B.getText().toString());
                tv_Result.setText((a / b)+ "");
            }
        });


    }
}