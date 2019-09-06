package com.example.latihanintent;

import android.os.Parcel;
import android.os.Parcelable;

public class MyBio implements Parcelable {
    private String name;
    private int age;

    public MyBio(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }

    protected MyBio(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<MyBio> CREATOR = new Parcelable.Creator<MyBio>() {
        @Override
        public MyBio createFromParcel(Parcel source) {
            return new MyBio(source);
        }

        @Override
        public MyBio[] newArray(int size) {
            return new MyBio[size];
        }
    };
}
