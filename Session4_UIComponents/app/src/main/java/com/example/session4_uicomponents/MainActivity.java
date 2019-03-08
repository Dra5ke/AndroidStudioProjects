package com.example.session4_uicomponents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_buttons, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_favourite:
                Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.activity1:
                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent1);
                return true;

            case R.id.activity2:
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
                return true;

            case R.id.activity3:
                Intent intent3 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent3);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
