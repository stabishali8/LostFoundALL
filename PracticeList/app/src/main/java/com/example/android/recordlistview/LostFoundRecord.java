package com.example.android.recordlistview;

/**
 * Created by Tabish Ali on 26-Jan-18.
 */

public class LostFoundRecord {
    private String title;
    private String description;
    private String status;
    private String image;

    public LostFoundRecord(String title,String description,String status,String image)
    {
        this.title = title;
        this.description = description;
        this.status = status;
        this.image = image;
    }

    public String getTitle()
    {
        return title;
    }
    public String getDescription()
    {
        return description;
    }
    public String getStatus()
    {
        return status;
    }
    public String getImage()
    {
        return image;
    }
}
