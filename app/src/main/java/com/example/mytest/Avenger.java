package com.example.mytest;

import java.io.Serializable;

public class Avenger implements Serializable {
    // Store the id of the Avenger
    private String mID;
    // Store the image of the  Avenger
    private String mImageDrawable;
    // Store the name of the Avenger
    private String mName;
    // Store the description of the Avenger
    private String mDesc;
    // Store the real_name of the Avenger
    private String mRealName;
    // Store the age of the Avenger
    private String mAge;
    private String mFam;
    private String mNoAvenger;
    private String mImp;
    private String mScream;

    // Constructor that is used to create an instance of the Avenger object
    public Avenger(String mID, String mImageDrawable, String mName, String mDesc, String mRealName,
                   String mAge, String mFam, String mNoAvenger, String mImp, String mScream) {
        this.mID = mID;
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mDesc = mDesc;
        this.mRealName = mRealName;
        this.mAge = mAge;
        this.mFam = mFam;
        this.mNoAvenger = mNoAvenger;
        this.mImp = mImp;
        this.mScream = mScream;
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

    public String getmRealName() {
        return mRealName;
    }

    public void setmRealName(String mRealName) {
        this.mRealName = mRealName;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }

    public String getmFam() {
        return mFam;
    }

    public void setmFam(String mFam) {
        this.mFam = mFam;
    }

    public String getmNoAvenger() {
        return mNoAvenger;
    }

    public void setmNoAvenger(String mImp) {
        this.mImp = mImp;
    }

    public String getmImp() {
        return mImp;
    }

    public void setmImp(String mImp) {
        this.mImp = mImp;
    }

    public String getmScream() {
        return mScream;
    }

    public void setmScream(String mScream) {
        this.mScream = mScream;
    }
}
