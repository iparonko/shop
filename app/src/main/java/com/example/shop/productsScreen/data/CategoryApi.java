package com.example.shop.productsScreen.data;

import com.example.shop.core.data.networkStore.BaseRetrofit;
import com.example.shop.core.entity.Category;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryApi {
    private static ProductsApi init() {
        ProductsApi productsApi = BaseRetrofit.getInstance().create(ProductsApi.class);
        return productsApi;
    }

    public static void getCategories() {
        init().getCategories().enqueue(new Callback<Category>() {
            @Override
            public void onResponse(Call<Category> call, Response<Category> response) {
                System.out.println(1);
            }

            @Override
            public void onFailure(Call<Category> call, Throwable t) {
                System.out.println(2);
            }
        });
    }
}
