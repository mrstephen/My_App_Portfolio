package com.droidbayapps.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AppPortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_portfolio, menu);
        return true;
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

    public void launchSpotifyStreamer(View view){
        Toast.makeText(this, "This button will launch the Spotify Streamer app", Toast.LENGTH_LONG).show();
    }

    public void launchScoresApp(View view){
        Toast.makeText(this, "This button will launch the Scores app", Toast.LENGTH_LONG).show();
    }

    public void launchLibraryApp(View view){
        Toast.makeText(this, "This button will launch the Library app", Toast.LENGTH_LONG).show();
    }

    public void launchBuildItBigger(View view){
        Toast.makeText(this, "This button will launch the Build it Bigger app", Toast.LENGTH_LONG).show();
    }

    public void launchXYZReader(View view){
        Toast.makeText(this, "This button will launch the XYZ Reader app", Toast.LENGTH_LONG).show();
    }

    public void launchCapstoneApp(View view){
        Toast.makeText(this, "This button will launch my Capstone app", Toast.LENGTH_LONG).show();
    }
}
