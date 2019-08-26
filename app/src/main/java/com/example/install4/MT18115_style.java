package com.example.install4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MT18115_style extends AppCompatActivity {

    String str;
    TextView text;
    Spinner spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MT18115_activity_style);
        addListenerOnSpinnerItemSelection();
        addItemsOnSpinner2();
        text = findViewById(R.id.stylizedText);
        Toast.makeText(this, "Here you change the Style", Toast.LENGTH_SHORT).show();
        Bundle bundle = getIntent().getExtras();
        str = bundle.getString("text");
        Log.d("string",text.getText().toString());
        text.setText(str);
    }

    public void addItemsOnSpinner2() {
        spinner2 = findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("Bold");
        list.add("Italics");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner2 = findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                if ("Bold".equals(adapterView.getItemAtPosition(pos).toString())) {
                    Typeface type = Typeface.defaultFromStyle(Typeface.BOLD);
                    text.setTypeface(type);
                }
                else if ("Italics".equals(adapterView.getItemAtPosition(pos).toString())) {
                    Typeface type = Typeface.defaultFromStyle(Typeface.ITALIC);
                    text.setTypeface(type);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
