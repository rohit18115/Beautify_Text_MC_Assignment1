package com.example.install4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MT18115_font extends AppCompatActivity {

    String str;
    TextView text;
    Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MT18115_activity_font);
        addListenerOnSpinnerItemSelection();
        addItemsOnSpinner1();
        text = findViewById(R.id.modifiedText);
        Toast.makeText(this, "Here you change the Font",Toast.LENGTH_SHORT).show();
        Bundle bundle = getIntent().getExtras();
        str = bundle.getString("text");
        text.setText(str);
//        Log.d("tag","amaticscregular");
    }
    public void addItemsOnSpinner1() {

        spinner1 = findViewById(R.id.spinner1);
        List<String> list = new ArrayList<String>();
        list.add("amaticscregular");
        list.add("ostrichregular");
        list.add("pacifico");
        list.add("ralewaylight");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                if ("amaticscregular".equals(adapterView.getItemAtPosition(pos).toString())) {
                    Typeface type = Typeface.createFromAsset(getAssets(),"fonts/amaticscregular.ttf");
                    text.setTypeface(type);
                }
                else if ("ostrichregular".equals(adapterView.getItemAtPosition(pos).toString())) {
                    Typeface type = Typeface.createFromAsset(getAssets(),"fonts/ostrichregular.ttf");
                    text.setTypeface(type);
                }
                else if ("pacifico".equals(adapterView.getItemAtPosition(pos).toString())) {
                    Typeface type = Typeface.createFromAsset(getAssets(),"fonts/pacifico.ttf");
                    text.setTypeface(type);
                }
                else if ("ralewaylight".equals(adapterView.getItemAtPosition(pos).toString())) {
                    Typeface type = Typeface.createFromAsset(getAssets(),"fonts/ralewaylight.ttf");
                    text.setTypeface(type);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


}
