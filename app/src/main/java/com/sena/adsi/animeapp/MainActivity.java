package com.sena.adsi.animeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List items = new ArrayList();
        items.add(new Anime(R.drawable.ic_launcher_foreground, "Angel Beats", 230));
        items.add(new Anime(R.drawable.ic_launcher_foreground, "Death Note", 456));
        items.add(new Anime(R.drawable.ic_launcher_foreground, "Fate Stay Night", 3));
        items.add(new Anime(R.drawable.ic_launcher_foreground, "Welcome to the NHK",345));
        items.add(new Anime(R.drawable.ic_launcher_foreground, "Suzumiya Haruhi",34));
// Obtener el Recycler
        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        recyclerView.setHasFixedSize(true);
// Usar un administrador para LinearLayout
    layoutManager = new LinearLayoutManager(this);
   recyclerView.setLayoutManager(layoutManager);
// Crear un nuevo adaptador
    adapter = new AnimeAdapter(items);
    recyclerView.setAdapter(adapter);
    }
}