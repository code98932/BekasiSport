package com.example.bekasisport.Comunity.Badminton;

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

public class ListBadminton extends RecyclerView.Adapter<ListBadminton.ListViewHolder> {

    private final ArrayList<Badminton> listBadminton;

    public ListBadminton(ArrayList<Badminton> list){
        this.listBadminton = list;
    }


    @NonNull
    @Override
    public ListBadminton.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zitem_row,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBadminton.ListViewHolder holder, int position) {
        Badminton badminton = listBadminton.get(position);
        Glide.with(holder.itemView.getContext())
                .load(badminton.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(badminton.getName());
        holder.tvDetail.setText(badminton.getDetail());

        holder.itemView.setOnClickListener(v -> {
            Intent intent =new Intent(v.getContext(), DetailBadminton.class);
            intent.putExtra("badminton",(Badminton) listBadminton.get(position));
            v.getContext().startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return listBadminton.size();
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
