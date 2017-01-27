package com.paep3nguin.campusmap;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by William on 1/26/2017.
 */
public class Stop {
    int id;
    String name;
    double lat;
    double lon;
    int buddy;

    LatLng getLatLng() {
        return new LatLng(lat, lon);
    }
}
