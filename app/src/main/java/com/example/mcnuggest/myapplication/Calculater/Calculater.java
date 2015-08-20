package com.example.mcnuggest.myapplication.Calculater;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.mcnuggest.myapplication.R;

/**
 * Created by mcnuggest on 15/8/20.
 */
public class Calculater extends Activity implements OnClickListener {
    private Button number0;
    private Button number1;
    private Button number2;
    private Button number3;
    private Button number4;
    private Button number5;
    private Button number6;
    private Button number7;
    private Button number8;
    private Button number9;
    private Button jia;
    private Button jian;
    private Button cheng;
    private Button chu;
    private Button numberdian;
    private Button dengyu;
    private Button clear;
    private Button delete;
    private EditText xianshi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculater);
        initBunnton();
    }

    private void initBunnton() {
        number1 = (Button) findViewById(R.id.number1);
        number2 = (Button) findViewById(R.id.number2);
        number3 = (Button) findViewById(R.id.number3);
        number4 = (Button) findViewById(R.id.number4);
        number5 = (Button) findViewById(R.id.number5);
        number6 = (Button) findViewById(R.id.number6);
        number7 = (Button) findViewById(R.id.number7);
        number8 = (Button) findViewById(R.id.number8);
        number9 = (Button) findViewById(R.id.number9);
        number0 = (Button) findViewById(R.id.number0);
        jia = (Button) findViewById(R.id.jia);
        jian = (Button) findViewById(R.id.jian);
        cheng = (Button) findViewById(R.id.cheng);
        chu = (Button) findViewById(R.id.chu);
        dengyu = (Button) findViewById(R.id.dengyu);
        numberdian = (Button) findViewById(R.id.numberdian);
        clear = (Button) findViewById(R.id.clear);
        delete = (Button) findViewById(R.id.delete);
        xianshi = (EditText) findViewById(R.id.shuru);
        number0.setOnClickListener(this);
        number1.setOnClickListener(this);
        number2.setOnClickListener(this);
        number3.setOnClickListener(this);
        number4.setOnClickListener(this);
        number5.setOnClickListener(this);
        number6.setOnClickListener(this);
        number7.setOnClickListener(this);
        number8.setOnClickListener(this);
        number9.setOnClickListener(this);
        jia.setOnClickListener(this);
        jian.setOnClickListener(this);
        cheng.setOnClickListener(this);
        chu.setOnClickListener(this);
        dengyu.setOnClickListener(this);
        numberdian.setOnClickListener(this);
        clear.setOnClickListener(this);
        delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str = xianshi.getText().toString();
        switch (v.getId()) {
            case R.id.number0:
            case R.id.number1:
            case R.id.number2:
            case R.id.number3:
            case R.id.number4:
            case R.id.number5:
            case R.id.number6:
            case R.id.number7:
            case R.id.number8:
            case R.id.number9:
            case R.id.numberdian:
                xianshi.setText(str + ((Button) v).getText());
                break;
            case R.id.jia:
            case R.id.jian:
            case R.id.cheng:
            case R.id.chu:
                xianshi.setText(str + " " + ((Button) v).getText() + " ");
                break;
            case R.id.clear:
                xianshi.setText("");
                break;
            case R.id.delete:
                if (str != null && !str.equals("")) {
                    xianshi.setText(str.substring(0, str.length() - 1));
                }
                break;
            case R.id.dengyu:
                double a = getResult(xianshi.getText().toString());
                if (a != 0) {
                    xianshi.setText(a + "");
                }
                break;

        }
    }

    private double getResult(String exp) {
        if (exp == null || exp.equals("")) {
            xianshi.setText("");
            return 0;
        }
        if (exp.equals(" ")) {
            xianshi.setText("");
            return 0;
        }
        double result = 0;
        String s1 = exp.substring(0, exp.indexOf(" "));//运算符前面的字符串
        String op = exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 2);//截取到的运算符
        String s2 = exp.substring(exp.indexOf(" ") + 3);
        if (!s1.equals("") && !s2.equals("")) {

            switch (op) {
                case "+":
                    if (!s2.contains(" ")) {
                        double d1 = Double.parseDouble(s1);
                        double d2 = Double.parseDouble(s2);
                        result = d1 + d2;
                    } else {
                        double d1 = Double.parseDouble(s1);
                        result=getResult(s2);
                        result = d1 + result;
                    }
                    break;
                case "-":
                    if (!s2.contains(" ")) {
                        double d1 = Double.parseDouble(s1);
                        double d2 = Double.parseDouble(s2);
                        result = d1 - d2;
                    }else {
                        double d1 = Double.parseDouble(s1);
                        result=getResult(s2);
                        result = d1 - result;
                    }
                    break;
                case "*":
                    if (s2.contains(" ")) {
                        double d1 = Double.parseDouble(s1);
                        double d2 = Double.parseDouble(s2);
                        result = d1 * d2;
                    }else {
                        double d1 = Double.parseDouble(s1);
                        result=getResult(s2);
                        result = d1 * result;

                    }
                    break;
                case "/":
                    if (!s2.contains(" ")) {
                        double d1 = Double.parseDouble(s1);
                        double d2 = Double.parseDouble(s2);
                        result = d1 / d2;
                    }else {
                        double d1 = Double.parseDouble(s1);
                        result=getResult(s2);
                        result = d1 / result;
                    }
                    break;
            }
        }
        return result;
    }
}
