package com.example.shop.productsScreen.data;

import com.example.shop.core.entity.Category;
import com.example.shop.core.entity.Categories;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

interface ProductsApi {

    @Headers({
            "X-Oc-Restadmin-Id: 123"
    })
    @GET("categories")
    Observable<Categories> getCategories();

    @GET("products/category/{category_id}")
    Observable<List<Category>> getProducts(@Path("category_id") int categoryId);
}
