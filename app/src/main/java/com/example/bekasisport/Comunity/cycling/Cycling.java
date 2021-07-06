package com.example.bekasisport.Comunity.cycling;

import android.os.Parcel;
import android.os.Parcelable;

public class Cycling implements Parcelable {

    private String Name;
    private String detail;
    private int photo;

    public Cycling() {

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


    protected Cycling(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
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

    public static final Creator<Cycling> CREATOR = new Creator<Cycling>() {
        @Override
        public Cycling createFromParcel(Parcel in) {
            return new Cycling(in);
        }

        @Override
        public Cycling[] newArray(int size) {
            return new Cycling[size];
        }
    };
}
