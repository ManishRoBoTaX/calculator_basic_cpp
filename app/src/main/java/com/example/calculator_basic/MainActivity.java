package com.example.calculator_basic;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    static {
        System.loadLibrary("native-lib"); //load cpp library
    }

    public native int add(int a, int b);
    public native int sub(int a, int b);
    public native int mul(int a, int b);
    public native int div(int a, int b);

    public void Add(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById((R.id.editTextNumber3));

        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int result = add(a,b);

        et3.setText(result);
    }

    public void Sub(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById((R.id.editTextNumber3));

        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int result = sub(a,b);

        et3.setText(result);
    }

    public void Mul(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById((R.id.editTextNumber3));

        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int result = mul(a,b);

        et3.setText(result);
    }

    public void Div(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById((R.id.editTextNumber3));

        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int result = div(a,b);

        et3.setText(result);
    }

}