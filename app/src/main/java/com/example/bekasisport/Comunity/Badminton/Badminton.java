package com.example.bekasisport.Comunity.Badminton;

import android.os.Parcel;
import android.os.Parcelable;

public class Badminton implements Parcelable {

    private String Name;
    private String detail;
    private int photo;

    protected Badminton(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public Badminton() {

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


    public static final Creator<Badminton> CREATOR = new Creator<Badminton>() {
        @Override
        public Badminton createFromParcel(Parcel in) {
            return new Badminton(in);
        }

        @Override
        public Badminton[] newArray(int size) {
            return new Badminton[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
