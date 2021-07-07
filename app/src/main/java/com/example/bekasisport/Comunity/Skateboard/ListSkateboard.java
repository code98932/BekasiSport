package com.example.bekasisport.Comunity.Skateboard;

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

public class ListSkateboard extends RecyclerView.Adapter<ListSkateboard.ListViewHolder> {

    private final ArrayList<Skateboard> listskateboard;

    public ListSkateboard(ArrayList<Skateboard> list){
        this.listskateboard = list;
    }

    @NonNull
    @Override
    public ListSkateboard.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zitem_row,parent,false);
        return new ListSkateboard.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListSkateboard.ListViewHolder holder, int position) {
        Skateboard skateboard = listskateboard.get(position);
        Glide.with(holder.itemView.getContext())
                .load(skateboard.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(skateboard.getName());
        holder.tvDetail.setText(skateboard.getDetail());

        holder.itemView.setOnClickListener(v -> {
            Intent intent =new Intent(v.getContext(), DetailSkateboard.class);
            intent.putExtra("skateboard",(Skateboard) listskateboard.get(position));
            v.getContext().startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return listskateboard.size();
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
