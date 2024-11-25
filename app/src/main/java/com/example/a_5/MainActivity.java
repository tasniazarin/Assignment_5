package com.example.a_5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.a_5.Model.Model;
import com.example.a_5.adapter.RecyclerViewAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] titles = {"Daisy", "Rose", "Orchid", "Tulip", "Lily"};

        String[] subtitles = {
                "Scientific Name: Bellis Perennis\nSpecies: Asteraceae Famili",
                "Scientific Name: Rosa\nSpecies: Rosaceae Famili",
                "Scientific Name: Orchidaceae\nSpecies: Orchidaceae Famili",
                "Scientific Name: Tulipa\nSpecies: Tulipa Gesneriana Famili",
                "Scientific Name: Lilium\nSpecies: Liliaceae Famili"
        };

        Integer[] images = {
                R.drawable.img, R.drawable.img_1, R.drawable.img_2,
                R.drawable.img_3, R.drawable.img_4
        };

        ArrayList<Model> data = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            Model model = new Model();
            model.setTitle(titles[i]);
            model.setSubtitle(subtitles[i]);
            model.setImageId(images[i]);
            data.add(model);
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}