package com.example.shop.data.entity.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryDTO {

    @SerializedName("category_id")
    @Expose
    private int categoryId;

    @SerializedName("name")
    @Expose
    private String name;

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }
}
