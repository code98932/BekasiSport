package com.example.bekasisport.Comunity.Basket;

import android.os.Parcel;
import android.os.Parcelable;

public class Basket implements Parcelable {

    private String Name;
    private String detail;
    private int photo;

    protected Basket(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public Basket() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Basket> CREATOR = new Creator<Basket>() {
        @Override
        public Basket createFromParcel(Parcel in) {
            return new Basket(in);
        }

        @Override
        public Basket[] newArray(int size) {
            return new Basket[size];
        }
    };
}
