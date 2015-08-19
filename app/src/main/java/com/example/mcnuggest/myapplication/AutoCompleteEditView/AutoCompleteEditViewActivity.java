package com.example.mcnuggest.myapplication.AutoCompleteEditView;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.mcnuggest.myapplication.R;

/**
 * Created by mcnuggest on 15/8/18.
 */
public class AutoCompleteEditViewActivity extends Activity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button searchbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocompleteeditview);

        init();



    }
    private void initAutoComplete(String field ,AutoCompleteTextView autoCompleteTextView){
        SharedPreferences sp = getSharedPreferences("network_url", 0);
        String longhistory = sp.getString("history", "nothing");
        String[] histories = longhistory.split(",");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, histories);
        if (histories.length > 50) {
            String[] newHistories = new String[50];
            System.arraycopy(histories, 0, newHistories, 0, 50);
            adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_dropdown_item_1line, newHistories);
        }
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setDropDownVerticalOffset(5);
    }
    private void init(){
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.AutoCompleteEditView);
        searchbutton = (Button)findViewById(R.id.searchbutton);
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveHistory("history",autoCompleteTextView);
                initAutoComplete("history", autoCompleteTextView);
            }
        });
        initAutoComplete("history", autoCompleteTextView);
    }
    private void saveHistory(String field ,AutoCompleteTextView autoCompleteTextView){
        String text = autoCompleteTextView.getText().toString();
        SharedPreferences sp = getSharedPreferences("network_url", 0);
        String longhistory = sp.getString(field, "nothing");
        if (!longhistory.contains(text + ",")) {
            StringBuilder sb = new StringBuilder(longhistory);
            sb.insert(0, text + ",");
            sp.edit().putString("history", sb.toString()).commit();
        }
    }
}
