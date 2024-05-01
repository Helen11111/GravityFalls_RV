package com.example.gravityfalls_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gravityfalls_app.model.CharacterData;
import com.example.gravityfalls_app.model.CharacterService;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private CharacterAdapter adapter;

    private ArrayList<CharacterData> characters = new ArrayList<>();

    private final CharacterService characterService = new CharacterService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        /*GridLayoutManager layoutManager = new GridLayoutManager(this, 5);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);*/

        recyclerView.setLayoutManager(layoutManager);

        adapter = new CharacterAdapter(this, characters);
        recyclerView.setAdapter(adapter);

    }


    @Override
    protected void onResume() {
        super.onResume();
        characters.clear();
        new Thread(() -> {
            ArrayList<CharacterData> newCharacters = characterService.getCharacters();
            runOnUiThread(() -> {
                characters.clear();
                characters.addAll(newCharacters);
                adapter.notifyDataSetChanged();
            });

        }).start();
    }
}