package com.example.session3_intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class Main3Activity extends AppCompatActivity {

    Switch pictureSwitch;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        picture = findViewById(R.id.picture);
        pictureSwitch = findViewById(R.id.switch1);

        pictureSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pictureSwitch.isChecked())
                {
                    pictureSwitch.setChecked(false);
                }
                else
                {
                    pictureSwitch.setChecked(true);
                }
            }
        });
    }
}
