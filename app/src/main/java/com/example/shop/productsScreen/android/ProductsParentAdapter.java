package com.example.shop.productsScreen.android;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.Category;
import com.example.shop.R;

import java.util.List;

public class ProductsParentAdapter extends RecyclerView.Adapter<ProductsParentAdapter.ProductsParentHolder> {

    private List<Category> categories;
    private Activity activity;

    ProductsParentAdapter(List<Category> categories, Activity activity) {
        this.categories = categories;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ProductsParentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(activity);
        return new ProductsParentHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsParentHolder holder, int position) {
        Category category = categories.get(position);
        holder.bind(category);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    List<Category> getCategories() {
        return categories;
    }

    class ProductsParentHolder extends RecyclerView.ViewHolder {
        private TextView textViewCategoryName;
        private RecyclerView recycleViewCategory;

        ProductsParentHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_category, parent, false));

            textViewCategoryName = this.itemView.findViewById(R.id.textViewCategoryName);
            recycleViewCategory = this.itemView.findViewById(R.id.recycleViewCategory);
        }

        public void bind(Category category) {
            initRecycleView(category);
            initAdapter(category);
        }

        private void initRecycleView(Category category) {
            textViewCategoryName.setText(category.getName());
            recycleViewCategory.setLayoutManager(new LinearLayoutManager(itemView.getContext(), RecyclerView.HORIZONTAL, false));
        }

        private void initAdapter(Category category) {
            ProductsChildAdapter productsChildAdapter = new ProductsChildAdapter(category.getProducts(), activity);
            recycleViewCategory.setAdapter(productsChildAdapter);
        }
    }
}
