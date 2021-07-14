package com.example.bekasisport.News;

import android.os.Parcel;
import android.os.Parcelable;

public class News implements Parcelable {

    private String Name;
    private String detail;
    private int photo;

    protected News(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public News() {

    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
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

}
