package com.example.shop.productsScreen.data;

import android.os.AsyncTask;

import com.example.shop.core.data.networkStore.BaseRetrofit;
import com.example.shop.core.entity.Category;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryApi {
    private static ProductsApi init() {
        ProductsApi productsApi = BaseRetrofit.getInstance().create(ProductsApi.class);
        return productsApi;
    }

    public static void getCategories() {
            init().getCategories()
                    .subscribeOn(Schedulers.io());
    }
}
