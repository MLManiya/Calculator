package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button Ac,Back,Div,Mul,Seven,Eight,Nine,Min,One,Two,Three,Four,Five,Six,Plus,Equal,Doublezero,Zero,Dot,Equl;

    String temp,t;
    int cnt=0;
    double min,mul,div;
    double n1,n2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        Ac = findViewById(R.id.Ac);
        Back = findViewById(R.id.Back);
        Div = findViewById(R.id.Div);
        Mul = findViewById(R.id.Mul);
        Seven = findViewById(R.id.Seven);
        Eight = findViewById(R.id.Eight);
        Nine = findViewById(R.id.Nine);
        Min = findViewById(R.id.Min);
        Four = findViewById(R.id.Four);
        Five = findViewById(R.id.Five);
        Six = findViewById(R.id.Six);
        Plus = findViewById(R.id.Plus);
        One = findViewById(R.id.One);
        Two = findViewById(R.id.Two);
        Three = findViewById(R.id.Three);
        Equal = findViewById(R.id.Equal);
        Doublezero = findViewById(R.id.Doublezero);
        Zero = findViewById(R.id.Zero);
        Dot = findViewById(R.id.Dot);
      //  Equl = findViewById(R.id.Equl);


        Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"0";
                editText.setText(""+t);
                editText.setText("");
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                if(editText.getText().length()>0)
                {
                    t=temp.substring(0, temp.length()-1);
                    editText.setText(""+t);
                }
                else
                {
                    editText.setText("");
                }
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = String.valueOf(editText.getText());
                n1 = Integer.parseInt(str1);
                editText.setText("");
                cnt=4;
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = String.valueOf(editText.getText());
                n1 = Integer.parseInt(str1);
                editText.setText("");
                cnt=3;
            }
        });

        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"7";
                editText.setText(""+t);
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"8";
                editText.setText(""+t);
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"9";
                editText.setText(""+t);
            }
        });

        Min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = String.valueOf(editText.getText());
                n1 = Integer.parseInt(str1);
                editText.setText("");
                cnt=2;
            }
        });

        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"4";
                editText.setText(""+t);
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"5";
                editText.setText(""+t);
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"6";
                editText.setText(""+t);
            }
        });

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = String.valueOf(editText.getText());
                n1 = Double.parseDouble(str1);
                editText.setText("");
                cnt=1;
            }
        });

        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"1";
                editText.setText(""+t);
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"2";
                editText.setText(""+t);
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"3";
                editText.setText(""+t);
            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str2 = String.valueOf(editText.getText());
                n2 = Double.parseDouble(str2);
                if(cnt==1)
                {
                    sum = n1+n2;
                    editText.setText(""+sum);
                }
                if(cnt==2)
                {
                    min = n1-n2;
                    editText.setText(""+min);
                }
                if(cnt==3)
                {
                    mul = n1*n2;
                    editText.setText(""+mul);
                }
                if(cnt==4)
                {
                    div = n1/n2;
                    editText.setText(""+div);
                }
            }
        });

        Doublezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"00";
                editText.setText(""+t);
            }
        });

        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t = temp+"0";
                editText.setText(""+t);
            }
        });

        Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = String.valueOf(editText.getText());
                t=temp+".";
                editText.setText(""+t);
            }
        });

//        Equl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String temp = String.valueOf(editText.getText());
//                String t = temp+"7";
//                editText.setText(""+t);
//            }
//        });

    }
}