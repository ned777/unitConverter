package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;






public class MainActivity extends AppCompatActivity {

    RadioButton m2km,km2m;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputText = findViewById(R.id.editText);
        final TextView outputText = findViewById(R.id.textView1);

        m2km = (RadioButton)findViewById(R.id.radioButton);
        km2m = (RadioButton)findViewById(R.id.radioButton2);
        radioGroup = (RadioGroup)findViewById(R.id.RGroup);



        Button Add = findViewById(R.id.bt_add);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                if(m2km.isChecked()) {

                    double convertedNumber = (Double.valueOf(inputText.getText().toString())) * 1.6;
                    String stringdouble = Double.toString(convertedNumber);

                    outputText.setText(stringdouble + " KM");
                }else{
                    double convertedNumber = (Double.valueOf(inputText.getText().toString())) / 1.6;
                    String stringdouble = Double.toString(convertedNumber);

                    outputText.setText(stringdouble + " MI");
                }



            }
        });


    }
}


