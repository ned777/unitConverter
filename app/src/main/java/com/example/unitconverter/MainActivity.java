package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.os.Bundle;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public static void main(String args[])
    {
        int a;


        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer");
        a = in.nextInt();
        System.out.println("You entered integer " + a);

    }
}

