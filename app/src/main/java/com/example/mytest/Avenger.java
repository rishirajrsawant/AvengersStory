package com.example.mytest;

public class Avenger {
    // Store the id of the  movie poster
    private String mImageDrawable;
    // Store the name of the movie
    private String mName;
    // Store the release date of the movie
    private String mDesc;

    // Constructor that is used to create an instance of the Movie object
    public Avenger(String mImageDrawable, String mName, String mDesc) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mDesc = mDesc;
    }

    public String getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(String mImageDrawable) {

        this.mImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDesc() {

        return mDesc;
    }

    public void setmDesc(String mDesc) {

        this.mDesc = mDesc;
    }
}
