package com.example.install4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MT18115_MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textview;
    EditText text;
    String text1, text2,textsize;
    Button font,  size, style;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MT18115_activity_main);
        textview = findViewById(R.id.Text);
        text2 = textview.getText().toString();
        text = findViewById(R.id.editText);

        font = findViewById(R.id.changeFont);
        size = findViewById(R.id.changeSize);
        style = findViewById(R.id.changeStyle);

        font.setOnClickListener(this);
        size.setOnClickListener(this);
        style.setOnClickListener(this);

//        Bundle bundle = getIntent().getExtras();
//        textsize = bundle.getString("text4");
    }

    public void onClick(View view){
        text1 = text.getText().toString();
        switch(view.getId()){
            case R.id.changeFont:
                Intent intent = new Intent(MT18115_MainActivity.this, MT18115_font.class);

                intent.putExtra("text", text1);
//                intent.putExtra("MT18115_size",textsize);
                startActivity(intent);
                break;

            case R.id.changeSize:
                Intent intent1 = new Intent(MT18115_MainActivity.this, MT18115_size.class);
                intent1.putExtra("text", text1);
//                intent1.putExtra("MT18115_size",textsize);
                startActivity(intent1);
                break;

            case R.id.changeStyle:
                Intent intent2 = new Intent(MT18115_MainActivity.this, MT18115_style.class);
                intent2.putExtra("text", text1);
//                intent2.putExtra("MT18115_size",textsize);
                startActivity(intent2);
                break;
        }

    }
}
