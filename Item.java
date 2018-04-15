package com.example.drtil.pdfcreator1;

public class Item {

    private String itemID, userID, modelNumber, serialNumber, itemName, roomType, pictureURL;

    /** Constructor **/
    Item(String iid, String uid, String mNum, String sNum, String iName, String rType, String pURL) {
        itemID = iid;
        userID = uid;
        modelNumber = mNum;
        serialNumber = sNum;
        itemName = iName;
        roomType = rType;
        pictureURL = pURL;
    }
    /** End Constructor **/

    /** Setters **/
    public void setItemID(String iid){
        itemID = iid;
    }

    public void setUserID(String uid){
        userID = uid;
    }

    public void setModelNum(String mNum){
        modelNumber = mNum;
    }

    public void setSerialNumber(String sNum){
        serialNumber = sNum;
    }

    public void setItemName(String iName){
        itemName = iName;
    }

    public void setRoomType(String room){
        roomType = room;
    }

    public void setPictureURL(String pURL){
        pictureURL = pURL;
    }
    /** End Setters **/

    /** Getters **/
    public String getItemID(){
        return itemID;
    }

    public String getUserID(){
        return userID;
    }

    public String getModelNumber(){
        return modelNumber;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public String getItemName(){
        return itemName;
    }

    public String getRoomType(){
        return roomType;
    }

    public String getPictureURL(){
        return pictureURL;
    }
    /** End Getters **/


}
