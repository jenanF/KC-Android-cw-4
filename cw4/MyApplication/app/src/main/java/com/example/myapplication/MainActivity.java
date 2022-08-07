package com.example.myapplication;

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


        TextView a = findViewById(R.id.textView1);
        TextView b = findViewById(R.id.textView2);
           EditText n1= findViewById(R.id.num1);
           EditText n2= findViewById(R.id.num2);
                Button add = findViewById(R.id.button1);



                add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        int number1 = Integer.parseInt(n1.getText().toString());
                        int number2 = Integer.parseInt(n2.getText().toString()) ;
                        int total = number1+number2;

                        b.setText(String.valueOf(total));
                    }
                });








    }
}