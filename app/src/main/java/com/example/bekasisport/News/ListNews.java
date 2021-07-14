package com.example.bekasisport.News;

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

public class ListNews  extends RecyclerView.Adapter<ListNews.ListViewHolder> {
    private ArrayList<News> listNews;

    public ListNews(ArrayList<News> list){
        this.listNews = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zitem_row_news, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListNews.ListViewHolder holder, int position) {
        News news =listNews.get(position);
        Glide.with(holder.itemView.getContext())
                .load(news.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvDetail.setText(news.getDetail());


    }

    @Override
    public int getItemCount() {
        return listNews.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.gambarnews);
            tvDetail = itemView.findViewById(R.id.post_description);
        }
    }
}
