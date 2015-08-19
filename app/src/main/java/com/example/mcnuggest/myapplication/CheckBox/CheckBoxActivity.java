package com.example.mcnuggest.myapplication.CheckBox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.mcnuggest.myapplication.R;

/**
 * Created by mcnuggest on 15/8/19.
 */
public class CheckBoxActivity extends Activity {
    private CheckBox checkBox;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
        //初始化
        checkBox = (CheckBox) findViewById(R.id.checkbox1);
        textView = (TextView) findViewById(R.id.checkboxTextView);

        //设置监听事件
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setVisibility(View.VISIBLE);
                }else {
                    textView.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
