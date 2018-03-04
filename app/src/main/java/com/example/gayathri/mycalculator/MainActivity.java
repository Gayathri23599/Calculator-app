package com.example.gayathri.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String a = "";
    private String b = "";
    private TextView t ;
    private int op,k,c;
    private int sem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView)findViewById(R.id.editText);
    }

    public void charToNumber(View v){
        Button btn = (Button)findViewById(v.getId());
        if(sem == 0) {
            a += btn.getText().toString();
            t.setText(a);
        }
        else {
            String ch = btn.getText().toString();
            b += btn.getText().toString();
            t.setText(t.getText() + ch);
        }
    }

    public void set(View v){
        String q = t.getText().toString();
        t.setText(q + "=");
        performance();
    }
    public void reset(View v){
        sem = 0;
        a = "";
        b = "";
        k = 0;
        t.setText("");
    }

    public void operation(View v){
        Button btn = (Button)findViewById(v.getId());
        String x = btn.getText().toString();
        sem = 1;
        /*switch(x){
            case "+":
                op = 0;
                k++;
                break;
            case "-":
                op = 1;
                k++;
                break;
            case "*":
                op = 2;
                k++;
                break;
            case "/":
                op = 3;
                k++;
                break;

        }*/
        if(x == "+"){
            op = 0;
            k++;
        }
        else if(x == "-"){
            op = 1;
            k++;
        }
        else if(x == "*"){
            op = 2;
            k++;
        }
        else if(x == "/"){
            op = 3;
            k++;
        }
        t.setText(t.getText() + x);

    }
    public void performance() {
        int n1;
        int n2;
        switch(op){
            case 0:
                try{
                    n1 = Integer.parseInt(a);
                    n2 = Integer.parseInt(b);
                    if(k >= 1){
                        n1 = c;
                        b = "";
                    }
                    c = n1 + n2;
                    String q = t.getText().toString();
                    t.setText(q + c);
                }
                catch(Exception e) {
                    t.setText("Error");
                }
                break;
            case 1:
                try{
                    n1 = Integer.parseInt(a);
                    n2 = Integer.parseInt(b);
                    if(k >= 1){
                        n1 = c;
                        b = "";
                    }
                    c = n1 - n2;
                    String q = t.getText().toString();
                    t.setText(q + c);
                }
                catch(Exception e) {
                    t.setText("Error");
                }
                break;
            case 2:
                try{
                    n1 = Integer.parseInt(a);
                    n2 = Integer.parseInt(b);
                    if(k >= 1){
                        n1 = c;
                        b = "";
                    }
                    c = n1 * n2;
                    String q = t.getText().toString();
                    t.setText(q + c);
                }
                catch(Exception e) {
                    t.setText("Error");
                }
                break;
            case 3:
                try{
                    n1 = Integer.parseInt(a);
                    n2 = Integer.parseInt(b);
                    if(k >= 1){
                        n1 = c;
                        b = "";
                    }
                    c = n1 / n2;
                    String q = t.getText().toString();
                    t.setText(q + c);
                }
                catch(Exception e) {
                    t.setText("Error");
                }
                break;
        }
    }

}
