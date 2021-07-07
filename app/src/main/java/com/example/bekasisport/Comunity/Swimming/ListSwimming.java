package com.example.bekasisport.Comunity.Swimming;

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

public class ListSwimming extends RecyclerView.Adapter<ListSwimming.ListViewHolder> {

    private final ArrayList<Swimming> listswim;

    public ListSwimming(ArrayList<Swimming> list){
        this.listswim = list;
    }

    @NonNull
    @Override
    public ListSwimming.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zitem_row,parent,false);
        return new ListSwimming.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListSwimming.ListViewHolder holder, int position) {
        Swimming swimming = listswim.get(position);
        Glide.with(holder.itemView.getContext())
                .load(swimming.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(swimming.getName());
        holder.tvDetail.setText(swimming.getDetail());

        holder.itemView.setOnClickListener(v -> {
            Intent intent =new Intent(v.getContext(), DetailSwimming.class);
            intent.putExtra("swim",(Swimming) listswim.get(position));
            v.getContext().startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return listswim.size();
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
