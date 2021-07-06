package com.example.bekasisport.Comunity.Football;

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
import com.example.bekasisport.Comunity.cycling.Cycling;
import com.example.bekasisport.Comunity.cycling.DetailCycling;
import com.example.bekasisport.Comunity.cycling.ListCycling;
import com.example.bekasisport.R;

import java.util.ArrayList;

public class ListFootball extends RecyclerView.Adapter<ListFootball.ListViewHolder> {

    private ArrayList<Football> listfootball;

    public ListFootball(ArrayList<Football> list){
        this.listfootball = list;
    }

    @NonNull
    @Override
    public ListFootball.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zitem_row,parent,false);
        return new ListFootball.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListFootball.ListViewHolder holder, int position) {
        Football football = listfootball.get(position);
        Glide.with(holder.itemView.getContext())
                .load(football.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(football.getName());
        holder.tvDetail.setText(football.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(), DetailFootball.class);
                intent.putExtra("football",(Football) listfootball.get(position));
                v.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listfootball.size();
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

