package com.sena.adsi.animeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimeAdapter extends
        RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>{
    private List<Anime> items;
    private LayoutInflater mInflater;
    private Context context;

    public AnimeAdapter(List<Anime> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public AnimeAdapter.AnimeViewHolder onCreateViewHolder
            (@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new AnimeViewHolder(v);
    }

    @Override
    public void onBindViewHolder
            (@NonNull AnimeAdapter.AnimeViewHolder holder, int position) {
        holder.imagen.setImageResource(items.get(position).getImagen());
        holder.nombre.setText(items.get(position).getNombre());
        holder.visitas.setText("Visitas:"+String.valueOf(items.get(position).getVisitas()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void setItems(List<Anime> items){items = items;}

    public class AnimeViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;
        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            visitas = (TextView) itemView.findViewById(R.id.visitas);
        }
    }
}
