package com.example.shop.productsScreen.data;

import com.example.shop.core.data.networkStore.BaseRetrofit;
import com.example.shop.data.entity.Category;
import com.example.shop.data.entity.dto.CategoriesDTO;
import com.example.shop.data.entity.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.shop.data.Data.categories;

public class CategoryApi {
    private static ProductsApi init() {
        ProductsApi productsApi = BaseRetrofit.getInstance().create(ProductsApi.class);
        return productsApi;
    }

    public static void getCategories(CategorySuccessMarker categorySuccessMarker) {
        init().getCategories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CategoriesDTO>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(CategoriesDTO categoriesDTO) {
                        Map<String, List<CategoryDTO>> hashMap = categoriesDTO.getData();
                        categories.clear();
                        for (Map.Entry<String, List<CategoryDTO>> entry : hashMap.entrySet()) {
                            categories.add(new Category(entry.getValue().get(0).getCategoryId(), entry.getValue().get(0).getName()));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                        categorySuccessMarker.update();
                    }
                });
    }
}
