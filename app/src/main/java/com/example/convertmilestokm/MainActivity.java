package com.example.convertmilestokm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(v -> {
            EditText textBoxMiles = findViewById(R.id.editTextMiles);
            EditText textBoxKm = findViewById(R.id.editTextKm);
            double vMiles = Double.parseDouble(textBoxMiles.getText().toString());
            double vKm = vMiles * 1.6;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            textBoxKm.setText(formatVal.format(vKm));

        });
        Button buttonConvKmToMiles = findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(v -> {
            EditText textBoxMiles = findViewById(R.id.editTextMiles);
            EditText textBoxKm = findViewById(R.id.editTextKm);
            double vKm = Double.parseDouble(textBoxKm.getText().toString());
            double vMiles = vKm / 1.6;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            textBoxMiles.setText(formatVal.format(vMiles));
        });
    }
}