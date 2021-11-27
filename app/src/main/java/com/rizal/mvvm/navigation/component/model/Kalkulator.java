package com.rizal.mvvm.navigation.component.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Kalkulator implements Parcelable {

    public float hasil;

    public Kalkulator(float hasil) {
        this.hasil = hasil;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(this.hasil);
    }

    public void readFromParcel(Parcel source) {
        this.hasil = source.readFloat();
    }

    protected Kalkulator(Parcel in) {
        this.hasil = in.readFloat();
    }

    public static final Parcelable.Creator<Kalkulator> CREATOR = new Parcelable.Creator<Kalkulator>() {
        @Override
        public Kalkulator createFromParcel(Parcel source) {
            return new Kalkulator(source);
        }

        @Override
        public Kalkulator[] newArray(int size) {
            return new Kalkulator[size];
        }
    };
}
