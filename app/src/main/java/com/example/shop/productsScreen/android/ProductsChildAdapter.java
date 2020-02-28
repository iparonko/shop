package com.example.shop.productsScreen.android;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.Product;
import com.example.shop.R;

import java.util.List;

public class ProductsChildAdapter extends RecyclerView.Adapter<ProductsChildAdapter.ProductsChildHolder> {

    private List<Product> products;
    private Activity activity;

    public ProductsChildAdapter(List<Product> products, Activity activity) {
        this.products = products;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ProductsChildAdapter.ProductsChildHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(activity);
        return new ProductsChildAdapter.ProductsChildHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsChildAdapter.ProductsChildHolder holder, int position) {
        Product product = products.get(position);
        holder.bind(product);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public List<Product> getProducts() {
        return products;
    }

    public class ProductsChildHolder extends RecyclerView.ViewHolder {

        private TextView textViewName;
        private TextView textViewPrice;

        public ProductsChildHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_product, parent, false));

            textViewName = this.itemView.findViewById(R.id.textViewName);
            textViewPrice = this.itemView.findViewById(R.id.textViewPrice);
        }

        public void bind(Product product) {
            textViewName.setText(product.getName());
            textViewPrice.setText(String.valueOf(product.getPrice()));
        }
    }
}
