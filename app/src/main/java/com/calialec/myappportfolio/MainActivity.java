package com.calialec.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bpaSpotifyStreamer = (Button) findViewById(R.id.button_portfolio_app_spotify_streamer);
        Button bpaScores = (Button) findViewById(R.id.button_portfolio_app_scores);
        Button bpaLibrary = (Button) findViewById(R.id.button_portfolio_app_library);
        Button bpaBuildItBigger = (Button) findViewById(R.id.button_portfolio_app_build_it_bigger);
        Button bpaXYZReader = (Button) findViewById(R.id.button_portfolio_app_xyz_reader);
        Button bpaCapstone = (Button) findViewById(R.id.button_portfolio_app_capstone);

        bpaSpotifyStreamer.setOnClickListener(portfolioAppOnClickListener);
        bpaScores.setOnClickListener(portfolioAppOnClickListener);
        bpaLibrary.setOnClickListener(portfolioAppOnClickListener);
        bpaBuildItBigger.setOnClickListener(portfolioAppOnClickListener);
        bpaXYZReader.setOnClickListener(portfolioAppOnClickListener);
        bpaCapstone.setOnClickListener(portfolioAppOnClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public View.OnClickListener portfolioAppOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String type = "";
            switch (v.getId()) {
                case R.id.button_portfolio_app_spotify_streamer:
                    type = getString(R.string.portfolio_app_spotify_streamer);
                    break;
                case R.id.button_portfolio_app_scores:
                    type = getString(R.string.portfolio_app_scores);
                    break;
                case R.id.button_portfolio_app_library:
                    type = getString(R.string.portfolio_app_library);
                    break;
                case R.id.button_portfolio_app_build_it_bigger:
                    type = getString(R.string.portfolio_app_build_it_bigger);
                    break;
                case R.id.button_portfolio_app_xyz_reader:
                    type = getString(R.string.portfolio_app_xyz_reader);
                    break;
                case R.id.button_portfolio_app_capstone:
                    type = getString(R.string.portfolio_app_capstone);
                    break;
            }
            Toast.makeText(getApplicationContext(), "This button will launch my " + type + " app!", Toast.LENGTH_LONG).show();
        }
    };
}
