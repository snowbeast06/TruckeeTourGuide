package com.example.android.truckeetourguide;

/**
 * Created by genetrinks on 2/7/18.
 */

public class TouristItem {

    private static final int NO_IMAGE_ASSIGNED = 0;
    private String TouristItemName;
    private String TouristItemAddress;
    private String TouristItemPhoneNum;
    private String TouristItemDescr;

    private int mDrawableImageResourceID;
    private int mRawAudioResourceID;

    // constructor
    public TouristItem(String name, String address) {
        TouristItemName = name;
        TouristItemAddress = address;
        // we'll leave the resourceID as 0 in this case
    }


    // constructor with image
    public TouristItem(String name, String address, int imageResourceID) {
        TouristItemName = name;
        TouristItemAddress = address;
        mDrawableImageResourceID = imageResourceID;
    }

    //constructor with name, address, phone, description and Image
    public TouristItem(String touristItemName, String touristItemAddress, String touristItemPhoneNum, String touristItemDescr, int mDrawableImageResourceID) {
        TouristItemName = touristItemName;
        TouristItemAddress = touristItemAddress;
        TouristItemPhoneNum = touristItemPhoneNum;
        TouristItemDescr = touristItemDescr;
        this.mDrawableImageResourceID = mDrawableImageResourceID;
    }

    // constructor with image and audio file
    public TouristItem(String name, String address, int imageResourceID, int audioResourceID) {
        TouristItemName = name;
        TouristItemAddress = address;
        mDrawableImageResourceID = imageResourceID;
        mRawAudioResourceID = audioResourceID;
    }

    //Getters
    public String getTouristItemName() {
        return TouristItemName;
    }

    public String getTouristItemAddress() {
        return TouristItemAddress;
    }

    public String getTouristItemPhoneNum() {return TouristItemPhoneNum; }

    public String getTouristItemDescr() {  return TouristItemDescr; }

    public int getDrawableImageResourceID() {
        return mDrawableImageResourceID;
    }

    public int getRawAudioResourceID() {
        return mRawAudioResourceID;
    }


    public boolean hasImage() {
        return (mDrawableImageResourceID != NO_IMAGE_ASSIGNED);
    }

    @Override
    public String toString() {
        return "TouristItem{" +
                "TouristItemName='" + TouristItemName + '\'' +
                ", TouristItemAddress='" + TouristItemAddress + '\'' +
                ", TouristItemPhoneNum" + TouristItemPhoneNum + '\'' +
                ", TouristItemDescription" + TouristItemDescr + '\'' +
                ", mDrawableImageResourceID=" + mDrawableImageResourceID +
                ", mRawAudioResourceID=" + mRawAudioResourceID +
                '}';
    }


}
