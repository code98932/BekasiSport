package com.example.bekasisport.Comunity.cycling;

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

public class ListCycling extends RecyclerView.Adapter<ListCycling.ListViewHolder> {

    private final ArrayList<Cycling> listcycling;

    public ListCycling(ArrayList<Cycling> list){
        this.listcycling = list;
    }

    @NonNull
    @Override
    public ListCycling.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zitem_row,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListCycling.ListViewHolder holder, int position) {
        Cycling cycling = listcycling.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cycling.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(cycling.getName());
        holder.tvDetail.setText(cycling.getDetail());

        holder.itemView.setOnClickListener(v -> {
            Intent intent =new Intent(v.getContext(), DetailCycling.class);
            intent.putExtra("cycling",(Cycling) listcycling.get(position));
            v.getContext().startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return listcycling.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
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
