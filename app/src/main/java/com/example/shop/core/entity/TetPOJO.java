package com.example.shop.core.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TetPOJO {

    /**
     * success : 0
     * error : ["Invalid or missing secret key"]
     * data : []
     */

    @SerializedName("success")
    private int success;

    @SerializedName("error")
    private List<String> error;

    @SerializedName("data")
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
