package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_sing_in;
    EditText login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inElements();
        singIn();

    }


    public void singIn(){
        button_sing_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().length() == 0 || password.getText().length() == 0)
                    Toast.makeText(MainActivity.this, "Enter login or password", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void inElements(){
        login = findViewById(R.id.login);
        login.setText("");
        password = findViewById(R.id.password);
        password.setText("");
        button_sing_in = findViewById(R.id.button);
    }
}