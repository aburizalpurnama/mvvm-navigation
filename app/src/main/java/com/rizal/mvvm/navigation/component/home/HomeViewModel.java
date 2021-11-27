package com.rizal.mvvm.navigation.component.home;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private float hasil = 0;

    public float hitung(float nilai1, float nilai2){

        Log.d(TAG, "hitung: menjalankan event hitung");
        hasil = nilai1 + nilai2;

        return hasil;
    }

    public float getHasil() {
        return hasil;
    }
}
