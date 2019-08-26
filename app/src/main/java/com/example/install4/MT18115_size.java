package com.example.install4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MT18115_size extends AppCompatActivity{

    String str,textsize;
    TextView text;
    SeekBar simpleSeekBar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MT18115_activity_size);
        text = findViewById(R.id.textSize);
        button = findViewById(R.id.applySize);

        Bundle bundle = getIntent().getExtras();
        str = bundle.getString("text");
        Toast.makeText(this, "Here you change the Size"+str,Toast.LENGTH_SHORT).show();
        text.setText(str);
//        textsize = bundle.getString("MT18115_size");
//        text.setTextSize(Integer.parseInt(textsize));
        simpleSeekBar= findViewById(R.id.simpleSeekBar);
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                text.setTextSize(progressChangedValue);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
//                text.setTextSize(progressChangedValue);
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MT18115_size.this, "Seek bar progress is :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent4 = new Intent(MT18115_size.this, MT18115_MainActivity.class);
//                intent4.putExtra("text4", text.getTextSize());
//                startActivity(intent4);
//
//            }
//        });
    }
}
