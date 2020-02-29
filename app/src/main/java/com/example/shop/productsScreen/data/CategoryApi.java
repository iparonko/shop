package com.example.shop.productsScreen.data;

import com.example.shop.core.data.networkStore.BaseRetrofit;
import com.example.shop.core.entity.TetPOJO;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class CategoryApi {
    private static ProductsApi init() {
        ProductsApi productsApi = BaseRetrofit.getInstance().create(ProductsApi.class);
        return productsApi;
    }

    public static void getCategories() {
        init().getCategories()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<TetPOJO>() {

                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println(1);
                    }

                    @Override
                    public void onNext(TetPOJO tetPOJO) {
                        System.out.println(1);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println(1);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println(1);
                    }
                });
    }
}
