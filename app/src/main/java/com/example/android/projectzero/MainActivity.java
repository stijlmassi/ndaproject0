package com.example.android.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void firstApp(View view) {

//Shows toast upon click
        Toast.makeText(this, "This will open my Spotify Streamer!", Toast.LENGTH_SHORT).show();

    }

    public void secondApp(View view) {
        //Shows toast upon click
        Toast.makeText(this, "This will open my Scores App!", Toast.LENGTH_SHORT).show();

    }

    public void thirdApp(View view) {

        //Shows toast upon click
        Toast.makeText(this, "This will open my Library App!", Toast.LENGTH_SHORT).show();

    }

    public void fourthApp(View view) {
//Shows toast upon click
        Toast.makeText(this, "This will open my Build it Bigger App!", Toast.LENGTH_SHORT).show();
    }

    public void fifthApp(View view) {
//Shows toast upon click
        Toast.makeText(this, "This will open my XYZ reader!", Toast.LENGTH_SHORT).show();

    }

    public void sixthApp(View view) {
        //Shows toast upon click
        Toast.makeText(this, "This will open my Capstone App!", Toast.LENGTH_SHORT).show();

    }
}
