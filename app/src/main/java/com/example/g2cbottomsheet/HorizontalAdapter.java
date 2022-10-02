package com.example.g2cbottomsheet;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    Context context;
    List<ModelHorizontal> list;
    int row_index = 0;

    public HorizontalAdapter(Context context, List<ModelHorizontal> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.horizontal_recycler_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.oil_text.setText(list.get(position).getOilText());
        holder.oil_company.setText(list.get(position).getOilCompany());
        holder.oil_price.setText(list.get(position).getOil_price());
        if(row_index == 0){
            holder.cardView.setBackgroundResource(R.drawable.background_bg);
            holder.oil_text.setTextColor(Color.parseColor("#000000"));
            holder.oil_company.setTextColor(Color.parseColor("#000000"));
            holder.oil_price.setTextColor(Color.parseColor("#000000"));
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();
                Toast.makeText(context, list.get(position).getOilCompany(), Toast.LENGTH_SHORT).show();
            }
        });

        if(row_index == position){
            holder.cardView.setBackgroundResource(R.drawable.background_bg);
            holder.oil_text.setTextColor(Color.parseColor("#000000"));
            holder.oil_company.setTextColor(Color.parseColor("#000000"));
            holder.oil_price.setTextColor(Color.parseColor("#000000"));
        }
        else{
            holder.cardView.setBackgroundResource(R.drawable.default_bg);
            holder.oil_text.setTextColor(Color.parseColor("#A8A7A7"));
            holder.oil_company.setTextColor(Color.parseColor("#A8A7A7"));
            holder.oil_price.setTextColor(Color.parseColor("#A8A7A7"));
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView oil_company,oil_text,oil_price;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            oil_company = itemView.findViewById(R.id.oil_company);
            oil_text = itemView.findViewById(R.id.oil_text);
            oil_price = itemView.findViewById(R.id.oil_price);
            cardView = itemView.findViewById(R.id.llhorizontal);
        }
    }
}
