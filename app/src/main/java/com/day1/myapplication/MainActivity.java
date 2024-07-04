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

    Button zero, one, two, three, four, five, six, seven, eight, nine, equal, clear, plus, sub, mul, div,Pow,tan,cos,sqrt,log;
    EditText editText;
    boolean sum, subtract, multiply, division,power,tangent,coss,square,loge;
    double value1, value2;

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

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        plus = findViewById(R.id.add);
        sub = findViewById(R.id.subtract);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        Pow  = findViewById(R.id.pow);
        tan = findViewById(R.id.tan);
        cos = findViewById(R.id.cos);
        sqrt = findViewById(R.id.sqrt);
        log = findViewById(R.id.log);

        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);

        editText = findViewById(R.id.input);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()) {
                    sum = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                } else
                {
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_LONG).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()) {
                    subtract = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()) {
                    multiply = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()) {
                    division = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Pow.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if (!editText.getText().toString().isEmpty()) {
                                           power = true;
                                           value1 = Double.parseDouble(editText.getText().toString());
                                           editText.setText("");
                                       } else {
                                       Toast.makeText(MainActivity.this, "Invalid input",Toast.LENGTH_LONG).show();
                                       }
                                   }
                               });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()) {
                    square = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                   // editText.setText("");
                        editText.setText("="+String.valueOf(Math.sqrt(value1)));
                }
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()) {
                    loge = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                    editText.setText("="+String.valueOf(Math.log(value1)));
                }
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()){
                    tangent = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                    editText.setText("="+String.valueOf(Math.tan(value1)));
                }
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().isEmpty()){
                    coss = true;
                    value1 = Double.parseDouble(editText.getText().toString());
                    editText.setText("="+String.valueOf(Math.cos(value1)));
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()) {
                    value2 = Double.parseDouble(editText.getText().toString());
                    if (sum) {
                        editText.setText("="+String.valueOf(value1 + value2));
                        sum = false;
                    } else if (subtract) {
                        editText.setText("="+String.valueOf(value1 - value2));
                        subtract = false;
                    } else if (multiply) {
                        editText.setText("="+String.valueOf(value1 * value2));
                        multiply = false;
                    } else if (division) {
                        if (value2 != 0) {
                            editText.setText("="+String.valueOf(value1 / value2));
                        } else {
                            Toast.makeText(MainActivity.this, "Canot divide by zero", Toast.LENGTH_SHORT).show();
                        }
                        division = false;
                    }
                    else if(power) {
                        editText.setText("="+String.valueOf(Math.pow(value1,value2)));
                    }  else if (loge){
                        editText.setText("="+String.valueOf(Math.log(value1)));
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Bad Expresion", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                value1 = 0;
                value2 = 0;
                sum = false;
                subtract = false;
                multiply = false;
                division = false;
            }
        });
    }
}
