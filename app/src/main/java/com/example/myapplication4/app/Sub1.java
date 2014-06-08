package com.example.myapplication4.app;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.myapplication4.app.R.id.pasmessage;
import static com.example.myapplication4.app.R.id.password;

/**
 * Created by Daichi on 2014/06/08.
 */
public class Sub1 extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void Click1(View v){
        //LocationListener mLocationListener  = new LocationListener();
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        LocationListener mLocationListener  = new LocationListener() {
            public void onStatusChanged(String provider, int status,
                                        Bundle extras) {
            }
            public void onProviderEnabled(String provider) {
            }
            public void onProviderDisabled(String provider) {
            }
            public void onLocationChanged(Location location) {
                String latitude = Double.toString(location.getLatitude());
                String longitude = Double.toString(location.getLongitude());
                String mapurl = "geo:40,120" ;
                //Uri mapUri = Uri.parse(url);
                Intent googleMapIntent = (googleMapIntent.ACTION_ALL_APPS, Uri);
                googleMapIntent.setAction(Intent.ACTION_VIEW);
                //googleMapIntent.setClassName("com.google.android.apps.maps","com.google.android.maps.MapsActivity");
               // googleMapIntent.setData(Uri.parse(mapurl));
                //googleMapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("com.google.android.apps.maps"));
                //googleMapIntent.putExtra(googleMapIntent.EXTRA_SUBJECT, "TSUTAYA");
                startActivity(googleMapIntent);
            }
        };
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000L, 0,mLocationListener);
    }

    public void ClickUserInformation(View v){
        Intent toUserInformation = new Intent(this, UserInformation.class);
        startActivity(toUserInformation);
    }

}
