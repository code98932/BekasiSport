package com.example.bekasisport.Comunity.Skateboard;

import android.os.Parcel;
import android.os.Parcelable;

public class Skateboard implements Parcelable {
    private String Name;
    private String detail;
    private int photo;

    protected Skateboard(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public Skateboard() {

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

    public static final Creator<Skateboard> CREATOR = new Creator<Skateboard>() {
        @Override
        public Skateboard createFromParcel(Parcel in) {
            return new Skateboard(in);
        }

        @Override
        public Skateboard[] newArray(int size) {
            return new Skateboard[size];
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
