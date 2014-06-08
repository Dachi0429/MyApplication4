package com.example.myapplication4.app;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.myapplication4.app.R.id.pasmessage;
import static com.example.myapplication4.app.R.id.password;


public class MainActivity extends ActionBarActivity {

    private EditText pass = null;
    private TextView hyouji = null;
    private LocationManager locationManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pass = (EditText) findViewById(password);
        hyouji = (TextView) findViewById(pasmessage);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void Click(View v){
        try {
            if (pass.getText().toString().equals("0429")) {
                Toast.makeText(this, "正しい", Toast.LENGTH_LONG).show();
            } else {
                //hyouji.setText("違う");
                Toast.makeText(this, pass.getText(), Toast.LENGTH_LONG).show();
            }
            Intent googleXmlIntent = new Intent(this, Sub1.class);
            startActivity(googleXmlIntent);
        }
        catch (NullPointerException e){
            Toast.makeText(this, "エラー", Toast.LENGTH_LONG).show();
        }
    }
}
