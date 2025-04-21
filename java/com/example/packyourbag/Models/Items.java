package com.example.packyourbag.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import androidx.room.Ignore;

@Entity(tableName = "items")
public class Items implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int ID;

    @ColumnInfo(name = "itemname")
    private String itemname;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "addedby")
    private String addedby;

    @ColumnInfo(name = "checked")
    private Boolean checked = false;

    public Items() {
        // Default constructor used by Room
    }

    @Ignore
    public Items(Boolean checked, String itemname, String category) {
        this.itemname = itemname;
        this.category = category;
        this.addedby = "system";
        this.checked = checked;
    }

    @Ignore
    public Items(Boolean checked, String itemname, String category, String addedby) {
        this.itemname = itemname;
        this.category = category;
        this.addedby = addedby;
        this.checked = checked;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getAddedby() {
        return addedby;
    }

    public void setAddedby(String addedby) {
        this.addedby = addedby;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
