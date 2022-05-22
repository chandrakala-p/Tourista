package com.e.locationpointer;

import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;

public class MapsActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;
    private FusedLocationProviderClient fusedLocationProviderClient;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        getSupportActionBar().setTitle("TOURista Navigation");

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        FusedLocationProviderClient fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        fusedLocationClient.getLastLocation()
                .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        // Got last known location. In some rare situations this can be null.
                        if (location != null) {
                            // Logic to handle location object
                        }
                    }
                });

    }









    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Lalbagh = new LatLng(12.951067, 77.584724);
        mMap.addMarker(new MarkerOptions().position(Lalbagh ).title("Welcome to Lal Bagh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lalbagh));

        LatLng  ISKCON = new LatLng(13.010103, 77.551096);
        mMap.addMarker(new MarkerOptions().position(ISKCON ).title("Welcome to ISKCON"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ISKCON));

        LatLng BullTemple = new LatLng(12.942253, 77.568064);
        mMap.addMarker(new MarkerOptions().position(BullTemple ).title("Welcome to Bull Temple "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BullTemple));

        LatLng NandiHills = new LatLng(13.384810, 77.664468);
        mMap.addMarker(new MarkerOptions().position(NandiHills ).title("Welcome to Nandi Hills"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NandiHills));

        LatLng  CubbonPark = new LatLng(12.976904, 77.594165);
        mMap.addMarker(new MarkerOptions().position(CubbonPark ).title("Welcome to Cubbon Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CubbonPark));

        LatLng UBCityMall = new LatLng(12.971663, 77.396058);
        mMap.addMarker(new MarkerOptions().position(UBCityMall ).title("Welcome to U.B.City "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UBCityMall));

        LatLng VisvesvarayaMuseum = new LatLng(12.975331, 77.596366);
        mMap.addMarker(new MarkerOptions().position(VisvesvarayaMuseum ).title("Welcome to Visvesvaraya Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(VisvesvarayaMuseum));

        LatLng  Wonderla = new LatLng(12.834660, 77.400950);
        mMap.addMarker(new MarkerOptions().position(Wonderla ).title("Welcome to Wonderla"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Wonderla));

        LatLng InnovativeFilmCity = new LatLng(12.778034, 77.415054);
        mMap.addMarker(new MarkerOptions().position(InnovativeFilmCity ).title("Welcome to Innovative Film City "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(InnovativeFilmCity));

        LatLng InfantJesusChurch = new LatLng(12.953746, 77.618757);
        mMap.addMarker(new MarkerOptions().position(InfantJesusChurch ).title("Welcome to Infant Jesus Shrine "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(InfantJesusChurch));






    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
