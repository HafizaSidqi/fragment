package com.fti.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DramaAdapter extends RecyclerView.Adapter<DramaAdapter.ViewHolder> {

    private Context context;
    private ArrayList<DramaModel> dramaModels;

    public DramaAdapter(ArrayList<DramaModel> dramaModels, Context context) {
        this.context = context;
        this.dramaModels = dramaModels;
    }


    /*public DramaAdapter(MainActivity context) {
        this.context = context;
    }*/

    @NonNull
    @Override
    public DramaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.drama_item, viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull DramaAdapter.ViewHolder viewHolder, int i) {

        Glide.with(context).load(getDramaModels().get(i).getPosterDrama()).into(viewHolder.ivPosterDrama);
        viewHolder.tvJudulDrama.setText(getDramaModels().get(i).getJudulDrama());
        viewHolder.tvSinopsisDrama.setText(getDramaModels().get(i).getSinopsisDrama());
        viewHolder.sinopsis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent moveIntent = new Intent (context, SinopsisDrama.class);
                moveIntent.putExtra("Judul", getDramaModels().get(i).getJudulDrama());
                moveIntent.putExtra("Sinopsis", getDramaModels().get(i).getSinopsisDrama());
                moveIntent.putExtra("poster", getDramaModels().get(i).getPosterDrama());
                context.startActivity(moveIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getDramaModels().size();
    }

    public ArrayList<DramaModel> getDramaModels() {
        return dramaModels;
    }

    public void setDramaModels(ArrayList<DramaModel> dramaModels) {
        this.dramaModels = dramaModels;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        ImageView ivPosterDrama;
        TextView tvJudulDrama, tvSinopsisDrama;
        Button sinopsis;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivPosterDrama = itemView.findViewById(R.id.poster);
            tvJudulDrama = itemView.findViewById(R.id.judul);
            tvSinopsisDrama = itemView.findViewById(R.id.ringkasan);
            sinopsis = itemView.findViewById(R.id.sinopsis);
        }
    }
}
