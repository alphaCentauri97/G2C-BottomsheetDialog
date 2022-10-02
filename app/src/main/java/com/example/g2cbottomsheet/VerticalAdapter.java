package com.example.g2cbottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.productName.setText(list.get(position).getProduct());
        holder.productText.setText(list.get(position).getProductText());
        holder.price.setText(list.get(position).getPrice());
        holder.img.setImageResource(list.get(position).getPic());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,list.get(position).getProduct() , Toast.LENGTH_SHORT).show();
            }
        });
        holder.addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,list.get(position).getPrice()+ " added", Toast.LENGTH_SHORT).show();
            }
        });
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
