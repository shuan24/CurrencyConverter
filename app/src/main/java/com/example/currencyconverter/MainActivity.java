package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertInToDollar(View view) {

        EditText amountInRupees = (EditText) findViewById(R.id.inputRupeeAmountEditText);
        Double inputAmount = Double.parseDouble(amountInRupees.getText().toString());
        Double amouontInDollar = inputAmount*0.013;
        Toast.makeText(this, "$ " + amouontInDollar.toString(), Toast.LENGTH_SHORT).show();
    }

    public void convertInToRupee(View view){

        EditText amountInDollars = (EditText) findViewById(R.id.inputDollarAmountEditText);
        Double inputAmount = Double.parseDouble(amountInDollars.getText().toString());
        Double amountInRupees = inputAmount*75.615;
        Toast.makeText(this, "₹ " + amountInRupees.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}