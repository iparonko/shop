package com.example.shop.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.adapter.rxjava2.Result;

public class Category {

    @SerializedName("success")
    private int categoryId;

    @SerializedName("name")
    private String name;

    private List<Product> products;

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
