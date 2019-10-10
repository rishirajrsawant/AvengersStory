package com.example.mytest;

import java.io.Serializable;

public class Avenger implements Serializable {
    //Store the id of the Avenger
    private String mID;
    // Store the image of the  Avenger
    private String mImageDrawable;
    // Store the name of the movie
    private String mName;
    // Store the description of the Avenger
    private String mDesc;


    // Constructor that is used to create an instance of the Avenger object
    public Avenger(String mID, String mImageDrawable, String mName, String mDesc) {
        this.mID = mID;
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mDesc = mDesc;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
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
