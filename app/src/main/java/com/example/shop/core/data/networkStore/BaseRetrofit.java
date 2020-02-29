package com.example.shop.core.data.networkStore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseRetrofit {
    private static Retrofit retrofit;
    private static Gson gson;

    private static final String BASE_URL = "http://opencart3-simple.api.opencart-api.com/api/rest_admin/";

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
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .addInterceptor(interceptor);

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(BASE_URL)
                    .client(client.build())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
    }
}
