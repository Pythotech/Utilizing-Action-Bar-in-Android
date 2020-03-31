package com.example.actionbar_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this,"phone is pressed",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Battery is pressed",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"About is pressed",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item4:
                Toast.makeText(this,"Setting is pressed",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item5:
                Toast.makeText(this,"phone 3 is pressed",Toast.LENGTH_LONG).show();
                return true;
        }
       return super.onOptionsItemSelected(item);
    }
}
