package com.example.shop.productsScreen.data;

import com.example.shop.data.entity.dto.CategoriesDTO;
import com.example.shop.data.entity.dto.CategoryDTO;

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
    Observable<CategoriesDTO> getCategories();

    @GET("products/category/{category_id}")
    Observable<List<CategoryDTO>> getProducts(@Path("category_id") int categoryId);
}
