package com.example.trabalho2bimestre;


import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;


import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    MapsActivity act;
    TelaPrincipal telaPrincipal;
    private GoogleMap mMap;

    Bundle saved;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }
    public MapsActivity(MapsActivity act, TelaPrincipal telaPrincipal){
        this.act = act;
        this.telaPrincipal = telaPrincipal;
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


        LatLng masp = new LatLng(-20.5807984,-47.8624549);
        mMap.addMarker(new MarkerOptions().position(masp).title("Nohara Clínica Veterinária Aquacenter")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.icone_carro_roxo_48px))
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(masp));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(masp, 21));

        PolygonOptions polygonOptions  = new PolygonOptions();
        polygonOptions.add(new LatLng(-20.58065032087239, -47.862365339871126));
        polygonOptions.add(new LatLng(-20.58072816265357, -47.86229895519839));
        polygonOptions.add(new LatLng(-20.580868152208538, -47.86248872148513));
        polygonOptions.add(new LatLng(-20.580783405183848, -47.86256181168037));

        polygonOptions.fillColor(Color.argb(60, 255, 15, 0));
    }


}