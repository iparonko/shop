package com.example.shop.productsScreen.data;

import com.example.shop.core.data.networkStore.BaseRetrofit;
import com.example.shop.core.entity.Categories;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class CategoryApi {
    private static ProductsApi init() {
        ProductsApi productsApi = BaseRetrofit.getInstance().create(ProductsApi.class);
        return productsApi;
    }

    public static void getCategories() {
        init().getCategories()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Categories>() {

                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("onSubscribe");
                    }

                    @Override
                    public void onNext(Categories categories) {
                        System.out.println("onNext");
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("onError");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete");
                    }
                });
    }
}
