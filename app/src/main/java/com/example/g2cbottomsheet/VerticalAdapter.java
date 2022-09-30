package com.example.g2cbottomsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.ViewHolder> {

    Context context;
    List<ModelVertical> list;

    public VerticalAdapter(Context context, List<ModelVertical> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vertical_recycler_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.productName.setText(list.get(position).getProduct());
        holder.productText.setText(list.get(position).getProductText());
        holder.price.setText(list.get(position).getPrice());
        holder.img.setImageResource(list.get(position).getPic());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView productName,productText,price;
        Button addbtn;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.product);
            productText = itemView.findViewById(R.id.productText);
            price = itemView.findViewById(R.id.price);
            addbtn = itemView.findViewById(R.id.addBtn);
            img = itemView.findViewById(R.id.productImg);
        }
    }
}
