package com.example.tishant.griet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Options_Page extends AppCompatActivity {
Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options__page);
        login = (Button)findViewById(R.id.login);
        register = (Button)findViewById(R.id.register);
    }
    public void goToLogin(View view){
        Intent i  = new Intent(Options_Page.this,login.class);
        startActivity(i);
    }
    public void goToRegister(View view){
        Intent i  = new Intent(Options_Page.this,Register.class);
        startActivity(i);
    }
}
