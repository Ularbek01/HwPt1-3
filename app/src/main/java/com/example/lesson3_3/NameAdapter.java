package com.example.lesson3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.nio.file.attribute.FileTime;
import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewholder> {

    private ArrayList<String> names;

    public NameAdapter(ArrayList<String> names) {
        this.names = names;
    }


    @NonNull
    @Override
    public NameViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewholder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_name_xml, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewholder holder, int position) {
        holder.bind(names.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
