package com.example.mprtut01;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt ;
    Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView);
        btnRandom = (Button) findViewById(R.id.button);
        btnRandom.setOnClickListener( new OnClickListener(){
            public  void onClick(View view){
                Random random = new Random();
                int number = random.nextInt(100);
                txt.setText(number+"");
            }
        });
    }
}