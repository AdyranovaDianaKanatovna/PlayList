package com.example.playlist;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.playlist.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
    private static OnClick click;
    private ArrayList<Model> playList;

    public MusicAdapter(OnClick onClick, ArrayList<Model> playList) {
        this.click = onClick;
        this.playList = playList;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMusicBinding binding =  ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MusicViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.bind(playList.get(position));
    }

    @Override
    public int getItemCount() {
        return playList.size();
    }

    static class MusicViewHolder extends RecyclerView.ViewHolder {
        private ItemMusicBinding binding;

        public MusicViewHolder(@NonNull ItemMusicBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Model model) {
            binding.music.setText(model.getMusic());
            binding.numberMusic.setText(String.valueOf(getAdapterPosition()+1));
            binding.timeMusic.setText(model.getTime());
            binding.nameSinger.setText(model.getNameSinger());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    click.click(model);
                }
            });
        }
    }
}
