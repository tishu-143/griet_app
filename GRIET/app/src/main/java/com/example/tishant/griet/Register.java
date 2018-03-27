package com.example.tishant.griet;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText name,roll,pass1,pass2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText)findViewById(R.id.name);
        roll = (EditText)findViewById(R.id.roll);
        pass1 = (EditText)findViewById(R.id.pass1);
        pass2 = (EditText)findViewById(R.id.pass2);
        b = (Button)findViewById(R.id.submit_data);
    }
    public void submitMyData(View view){
        if(pass1.getText().toString().equals(pass2.getText().toString())) {
            Toast.makeText(Register.this,"match",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Register.this, Options_Page.class);
            startActivity(i);
            finish();
        }
        else
        {
            pass1.setBackgroundColor(Color.RED);
            pass2.setBackgroundColor(Color.RED);
            Toast.makeText(Register.this,"Sorry passwords did'nt match",Toast.LENGTH_SHORT).show();
        }
    }
}
