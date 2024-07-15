package com.day1.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.*;

public class MainActivity extends ComponentActivity {

    checkBox piza, burger, shawarma;
    Button Price;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

      piza = findViewById(R.id.piza);
        burger = findViewById(R.id.burger);
        shawarma = findViewById(R.id.shawarma);
        price = findViewById(R.id.price);


      price.setOnClickListener(new View.onClickListener() {
          @Override
          public void onClick (View v) {
               StringBuilder result = new StringBuilder();
    if(piza.isChecked()) {    
        result = append("price is 100");
        Toast.makeTextt(MainActivity.this, "piza"+result,Toast.LENGTH_SHORT).show();
    }
              if(burger.isChecked()) {
             result.append("price is 200");
            Toast.makeText(MainActivity.this, "burger"+result, Toast.LENGTH_SHOR)T.show();}
              if(shawarma.isChecked()) {
         result.append("price is 150");
                  Toast.makeText(MainActivity.this, "shawarma"+result, Toast.LENGTH_SHORT).show();
              }
          }
      }

                     }
                                                 

