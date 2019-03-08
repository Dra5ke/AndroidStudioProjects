package com.example.session3_intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    Button back;
    Button change;
    TextView pink;
    TextView purple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back = findViewById(R.id.back);
        change = findViewById(R.id.change);
        pink = findViewById(R.id.sexyPinkLove);
        purple = findViewById(R.id.sexyPurpleLove);

        String data = getIntent().getExtras().getString("greeting");

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pink.getText().toString().equals(getResources().getString(R.string.love)))
                {
                    pink.setText(getResources().getString(R.string.hate));
                    purple.setText(getResources().getString(R.string.hate));
                }
                else
                {
                    pink.setText(getResources().getString(R.string.love));
                    purple.setText(getResources().getString(R.string.love));
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
