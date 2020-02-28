package com.example.shop.productsScreen.data;

import com.example.shop.core.entity.Category;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface ProductsApi {
    @GET("test")
    Call<Category> getCategories();

    @GET("products/category/{category_id}")
    Observable<List<Category>> getProducts(@Path("category_id") int categoryId);
}
