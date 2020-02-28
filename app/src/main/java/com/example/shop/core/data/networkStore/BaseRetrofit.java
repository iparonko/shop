package com.example.shop.core.data.networkStore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseRetrofit {
    private static Retrofit retrofit;
    private static Gson gson;

    private static final String BASE_URL = "http://5e590b7703a86a0014046bd5.mockapi.io/api/v1/";

    public static Retrofit getInstance() {
        initGson();
        initRetrofit();
        return retrofit;
    }

    private static void initGson() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .setLenient()
                    .create();
        }
    }

    private static void initRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
    }
}
