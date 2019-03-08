package com.example.session3_intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button newActivity;
    Button emailButton;
    Button activity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newActivity = findViewById(R.id.newActivity);
        emailButton = findViewById(R.id.email);
        activity3 = findViewById(R.id.activity3Button);

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"mail@mail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Test send email");
                intent.putExtra(Intent.EXTRA_TEXT, "This is the text in the email");
                startActivity(intent);
            }
        });

        newActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("greeting", "Hello, from Activity1");
                startActivity(intent);
            }
        });

        activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
