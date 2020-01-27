package com.example.degreeconverter;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

    public void onClick(View v) {

        EditText degree = findViewById(R.id.fahrenheitInput);

        TextView result = findViewById(R.id.result);

        double fNumber = Double.parseDouble(degree.getText().toString());

        double cNumber = (fNumber - 32) * 0.5556;

        DecimalFormat df = new DecimalFormat("###.###");

        result.setText(df.format(cNumber));

    }

    }

