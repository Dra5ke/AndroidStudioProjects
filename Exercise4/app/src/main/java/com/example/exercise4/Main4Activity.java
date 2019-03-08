package com.example.exercise4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        email = findViewById(R.id.emailText);
        password = findViewById(R.id.passwordText);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("user@email.com") && password.getText().toString().equals("ILOVEAND"))
                {
                    Toast.makeText(Main4Activity.this, "Welcome!", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(Main4Activity.this, "You have entered the wrong credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
