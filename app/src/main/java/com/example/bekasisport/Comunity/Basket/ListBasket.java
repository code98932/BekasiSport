package com.example.bekasisport.Comunity.Basket;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.bekasisport.R;

import java.util.ArrayList;

public class ListBasket extends RecyclerView.Adapter<ListBasket.ListViewHolder> {

    private ArrayList<Basket> listBasket;

    public ListBasket(ArrayList<Basket> list){
        this.listBasket = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zitem_row,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBasket.ListViewHolder holder, int position) {
        Basket basket = listBasket.get(position);
        Glide.with(holder.itemView.getContext())
                .load(basket.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(basket.getName());
        holder.tvDetail.setText(basket.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),DetailBasket.class);
                intent.putExtra("basket",(Basket) listBasket.get(position));
                v.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listBasket.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
