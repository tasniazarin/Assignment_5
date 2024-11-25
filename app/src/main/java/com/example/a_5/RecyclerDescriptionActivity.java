package com.example.a_5;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class RecyclerDescriptionActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title, subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_description);

        imageView = findViewById(R.id.imageView);
        title = findViewById(R.id.title);
        subtitle = findViewById(R.id.subtitle);

        imageView.setImageResource(getIntent().getIntExtra("image", 0));
        title.setText(getIntent().getStringExtra("title"));
        subtitle.setText(getIntent().getStringExtra("subtitle"));
    }
}