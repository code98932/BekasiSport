package com.example.bekasisport.Comunity.Swimming;

import android.os.Parcel;
import android.os.Parcelable;

public class Swimming implements Parcelable {
    private String Name;
    private String detail;
    private int photo;

    protected Swimming(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public Swimming() {

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

    public static final Creator<Swimming> CREATOR = new Creator<Swimming>() {
        @Override
        public Swimming createFromParcel(Parcel in) {
            return new Swimming(in);
        }

        @Override
        public Swimming[] newArray(int size) {
            return new Swimming[size];
        }
    };
}
