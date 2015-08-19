package com.example.mcnuggest.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.mcnuggest.myapplication.AutoCompleteEditView.AutoCompleteEditViewActivity;
import com.example.mcnuggest.myapplication.CheckBox.CheckBoxActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    //    private List<HomeButton> homeButtons = new ArrayList<HomeButton>();
    private Button dongtaizidongpipei;
    private Button checkboxbutton;
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dongtaizidongpipei = (Button) findViewById(R.id.dongtaizidongpipei);
        checkboxbutton = (Button) findViewById(R.id.checkboxbutton);
        checkboxbutton = (Button) findViewById(R.id.checkboxbutton);
        dongtaizidongpipei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, AutoCompleteEditViewActivity.class);
                startActivity(intent);

            }
        });
        checkboxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, CheckBoxActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

