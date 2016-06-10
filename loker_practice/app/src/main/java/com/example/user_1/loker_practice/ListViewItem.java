package com.example.user_1.loker_practice;

/**
 * Created by user-1 on 2016-06-09.
 */
public class ListViewItem {
    private boolean selected;
    private int  appImage;
    private String  appName;

    public void setSelected(boolean checked) {
        selected = checked;
    }
    public void setAppImage(int aImage) {
        appImage = aImage;
    }
    public void setAppName(String aName) {
        appName = aName;
    }

    public Boolean getSelected() {
        return this.selected;
    }
    public int getAppImage() {
        return this.appImage;
    }
    public String getAppName() {
        return this.appName;
    }
}
