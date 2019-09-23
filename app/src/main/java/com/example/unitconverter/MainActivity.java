package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputText = findViewById(R.id.editText);
        final TextView outputText = findViewById(R.id.textView1);
        Button Add = findViewById(R.id.bt_add);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String Value = inputText.getText().toString();
                outputText.setText(Value);
            }
        });


    }
}


