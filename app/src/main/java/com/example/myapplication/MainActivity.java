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
    EditText login, password;
    Button button_sing_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inElements();
    }

    public void inElements(){
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        button_sing_in = findViewById(R.id.button);

        button_sing_in.setOnClickListener(v -> {
            String text1 = login.getText().toString().trim();
            String text2 = password.getText().toString().trim();
            if (text1.equals("") || text2.equals("")) {
                Toast.makeText(MainActivity.this, "Enter login or password", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
            if (text2.length() > 6) {
                Toast.makeText(MainActivity.this, "Enter correct password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}