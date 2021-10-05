package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addition(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName5);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName6);
        Integer x = Integer.parseInt(myTextField1.getText().toString());
        Integer y = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(x + y);
    }

    public void subtraction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName5);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName6);
        Integer x = Integer.parseInt(myTextField1.getText().toString());
        Integer y = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(y - x);
    }

    public void multiplication(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName5);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName6);
        Integer x = Integer.parseInt(myTextField1.getText().toString());
        Integer y = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(x * y);
    }

    public void division(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName5);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName6);
        Integer x = Integer.parseInt(myTextField1.getText().toString());
        Integer y = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(y / x);
    }

    public void goToActivity2(Integer result) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", result.toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}