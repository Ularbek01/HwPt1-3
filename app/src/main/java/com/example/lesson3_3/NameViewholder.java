package com.example.lesson3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewholder extends RecyclerView.ViewHolder {

    private TextView tvname;

    public NameViewholder(@NonNull View itemView) {
        super(itemView);
        tvname = itemView.findViewById(R.id.tv_name);
    }

    public void bind(String name) {
        tvname.setText(name);
    }
}
