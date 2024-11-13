package com.example.calculator_binary;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputDecimal = findViewById(R.id.inputDecimal);
        Button convertButton = findViewById(R.id.convertButton);
        TextView resultText = findViewById(R.id.resultText);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimalInput = inputDecimal.getText().toString();
                if (!decimalInput.isEmpty()) {
                    try {
                        int decimalNumber = Integer.parseInt(decimalInput);
                        String binaryResult = Integer.toBinaryString(decimalNumber);
                        resultText.setText("Binario: " + binaryResult);
                    } catch (NumberFormatException e) {
                        resultText.setText("Por favor, ingrese un número válido.");
                    }
                } else {
                    resultText.setText("El camo no puede estar vacío.");
                }
            }
        });
    }
}