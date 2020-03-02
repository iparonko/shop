package com.example.shop.productsScreen.android;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.R;
import com.example.shop.core.android.BaseActivity;
import com.example.shop.productsScreen.data.CategoryApi;

public class ProductsActivity extends BaseActivity {

    private RecyclerView productsRecyclerView;
    private ProductsParentAdapter productsParentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        initRecycleView();
        initAdapter();
        CategoryApi.getCategories(productsParentAdapter);
    }

    private void initRecycleView() {
        productsRecyclerView = findViewById(R.id.products_recycle_view);
        productsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initAdapter() {
        productsParentAdapter = new ProductsParentAdapter( this);
        productsRecyclerView.setAdapter(productsParentAdapter);
    }

}
