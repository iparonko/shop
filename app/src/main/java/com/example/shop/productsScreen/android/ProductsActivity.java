package com.example.shop.productsScreen.android;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.core.entity.Category;
import com.example.shop.core.entity.Product;
import com.example.shop.R;
import com.example.shop.core.android.BaseActivity;
import com.example.shop.productsScreen.data.CategoryApi;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends BaseActivity {
    private RecyclerView productsRecyclerView;
    private ProductsParentAdapter productsParentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        initRecycleView();
        initAdapter();
        CategoryApi.getCategories();
    }

    @Override
    protected void onResume() {
        super.onResume();
        add();
    }

    private void initRecycleView() {
        productsRecyclerView = findViewById(R.id.products_recycle_view);
        productsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initAdapter() {
        productsParentAdapter = new ProductsParentAdapter(new ArrayList<Category>(), this);
        productsRecyclerView.setAdapter(productsParentAdapter);
    }

    private void add() {
        List<Product> products1 = new ArrayList<>();
        products1.add(new Product("444", 400));
        products1.add(new Product("333", 1000));
        products1.add(new Product("333", 1000));
        products1.add(new Product("333", 1000));
        products1.add(new Product("333", 1000));
        products1.add(new Product("333", 1000));
        products1.add(new Product("333", 1000));
        products1.add(new Product("333", 1000));
        productsParentAdapter.getCategories().add(new Category("nameCategory1", products1));

        List<Product> products2 = new ArrayList<>();
        products2.add(new Product("222erg", 400));
        products2.add(new Product("werger", 10200));
        products2.add(new Product("werger", 10200));
        products2.add(new Product("werger", 10200));
        productsParentAdapter.getCategories().add(new Category("nameCategory2", products2));

        List<Product> products3 = new ArrayList<>();
        products3.add(new Product("222erg", 400));
        products3.add(new Product("werger", 10200));
        products3.add(new Product("werger", 10200));
        products3.add(new Product("werger", 10200));
        products3.add(new Product("werger", 10200));
        products3.add(new Product("werger", 10200));
        products3.add(new Product("werger", 10200));
        productsParentAdapter.getCategories().add(new Category("products3", products3));

        List<Product> products4 = new ArrayList<>();
        products4.add(new Product("222erg", 400));
        products4.add(new Product("werger", 10200));
        products4.add(new Product("werger", 10200));
        products4.add(new Product("werger", 10200));
        products4.add(new Product("werger", 10200));
        products4.add(new Product("werger", 10200));
        products4.add(new Product("werger", 10200));
        productsParentAdapter.getCategories().add(new Category("products4", products4));

        productsParentAdapter.notifyDataSetChanged();
    }
}
