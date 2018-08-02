package com.example.hannahhoover.mock_ted_android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hannahhoover.mock_ted_android.model.PodcastData;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    List<PodcastData> podcastData;

    public RecyclerViewAdapter(Context context, List<PodcastData> podcastData) {
        this.context = context;
        this.podcastData = podcastData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //CardView cardView;
        ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            //cardView = v.findViewById(R.id.card_view);
            imageView = (ImageView) v.findViewById(R.id.image_main);

            /*v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("CardView", "CardView has been clicked.");
                }
            });*/


        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_podcast, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(podcastData.get(position).getImageView());


    }

    @Override
    public int getItemCount() {
        return podcastData.size();
    }

}
