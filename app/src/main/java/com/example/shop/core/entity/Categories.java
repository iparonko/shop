package com.example.shop.core.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Categories {

    @SerializedName("success")
    @Expose
    private int success;

    @SerializedName("error")
    @Expose
    private List<String> error;

    @SerializedName("data")
    @Expose
    private Map<String, ArrayList<Category>> data;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public Map<String, ArrayList<Category>> getData() {
        return data;
    }

    public void setData(Map<String, ArrayList<Category>> data) {
        this.data = data;
    }

    public class Category {

        @SerializedName("category_id")
        @Expose
        private int categoryId;

        @SerializedName("name")
        @Expose
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
}
