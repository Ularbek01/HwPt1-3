package com.example.lesson3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        names = new ArrayList<>();
        names.add("Spider-Man");
        names.add("Iron-Man");
        names.add("Batman");
        names.add("Super-Man");
        names.add("Thor");
        names.add("Black-Pantera");
        names.add("Black-Adam");
        names.add("Flash");
        names.add("DeadPool");
        names.add("Captain-America");
        names.add("Thanos");
        NameAdapter nameAdapter = new NameAdapter(names);
        recyclerView.setAdapter(nameAdapter);

    }
}