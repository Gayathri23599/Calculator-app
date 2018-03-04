package com.example.gayathri.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String a = "";
    private String b = "";
    TextView t = findViewById(R.id.editText);
    private int op;
    private int sem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void charToNumber(View v){
        Button btn = (Button)findViewById(v.getId());
        if(sem == 0)
            a += btn.getText().toString();
        else
            b += btn.getText().toString();
        t.setText(a+b);
    }

    public void operation(View v){
        Button btn = (Button)findViewById(v.getId());
        String x = btn.getText().toString();
        sem = 1;
        switch(x){
            case '+':
                op = 0;
                break;
            case '-':
                op = 1;
                break;
            case '*':
                op = 2;
                break;
            case '/':
                op = 3;
                break;
            case 'lg':
                op = 4;
                break;
            case 'ln':
                op = 5;
                break;
            case '%':
                op = 6;
                break;
            case 'sin':
                op = 7;
                break;
            case 'cos':
                op = 8;
                break;
            case 'tan':
                op = 9;
                break;
            case 'sqrt':
                op = 10;
                break;
            case '!':
                op = 11;
                break;
            case '^':
                op = 12;
                break;
            case 'pi':
                op = 13;
                break;
            case 'e':
                op = 14;
                break;
        }

    }
    public void performance(){
        
    }

}
