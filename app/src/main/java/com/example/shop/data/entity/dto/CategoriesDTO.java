package com.example.shop.data.entity.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class CategoriesDTO {

    @SerializedName("success")
    @Expose
    private int success;

    @SerializedName("error")
    @Expose
    private List<String> error;

    @SerializedName("data")
    @Expose
    private Map<String, List<CategoryDTO>> data;

    public Map<String, List<CategoryDTO>> getData() {
        return data;
    }
}
