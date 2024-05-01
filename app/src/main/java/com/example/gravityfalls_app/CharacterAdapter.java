package com.example.gravityfalls_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gravityfalls_app.model.CharacterData;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {

    private final ArrayList<CharacterData> characters;

    Context context;

    public CharacterAdapter(Context context, ArrayList<CharacterData> characters) {
        this.context = context;
        this.characters = characters;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nameTextView;

        private final TextView messageTextView;

        private final ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            nameTextView = (TextView) view.findViewById(R.id.textView);
            messageTextView = (TextView) view.findViewById(R.id.textView2);
            imageView = (ImageView) view.findViewById(R.id.imageView);
        }

        public void setCharacterData(CharacterData characterData){
            nameTextView.setText(characterData.name);
            messageTextView.setText(characterData.message);
            new ImageDownloadTask(imageView).execute(characterData.imageUrl);
        }
    }


    @NonNull
    @Override
    public CharacterAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.character_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CharacterAdapter.ViewHolder holder, int position) {
        int i = position;
        holder.setCharacterData(characters.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Position " + characters.get(i).name, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
