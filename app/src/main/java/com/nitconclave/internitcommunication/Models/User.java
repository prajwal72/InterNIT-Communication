package com.nitconclave.internitcommunication.Models;


import java.util.ArrayList;
import java.util.List;

public class User {
    private String mEmail;
    private String mName;
    private String mProfileUrl;
    private List<String> mList = new ArrayList<>();
    private boolean mInterests;

    public User() {

    }

    public User(String mEmail, String mName, String mProfileUrl, ArrayList<String> mList, boolean mInterests) {
        this.mEmail = mEmail;
        this.mName = mName;
        this.mProfileUrl = mProfileUrl;
        this.mList = mList;
        this.mInterests = mInterests;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmName() {
        return mName;
    }

    public String getmProfileUrl() {
        return mProfileUrl;
    }

    public List<String> getmList() {
        return mList;
    }

    public boolean ismInterests() {
        return mInterests;
    }

    public void setmInterests() {
        mInterests = true;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmProfileUrl(String mProfileUrl) {
        this.mProfileUrl = mProfileUrl;
    }

    public void setmList(List<String> mList) {
        this.mList = mList;
    }

    public void setmInterests(boolean mInterests) {
        this.mInterests = mInterests;
    }
}
