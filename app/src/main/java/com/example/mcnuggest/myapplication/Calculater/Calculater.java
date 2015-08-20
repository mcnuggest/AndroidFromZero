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
public class Calculater extends Activity {
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
    }

}
