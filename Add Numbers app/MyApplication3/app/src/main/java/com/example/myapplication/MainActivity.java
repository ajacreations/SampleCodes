package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView t1;
    private EditText No1,No2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        No1=findViewById(R.id.editTextNumber);
        No2=findViewById(R.id.editTextNumber2);
        t1=findViewById(R.id.textView3);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int no1=Integer.parseInt(No1.getText().toString());
                 int no2=Integer.parseInt(No2.getText().toString());
                 int no3=no1+no2;
                 t1.setText(no1+" plus "+no2+" equls "+no3);


            }
        });




    }
}