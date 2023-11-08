package com.rafsan.class28picassolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

         Picasso.get()
                .load("https://upload.wikimedia.org/wikipedia/commons/3/36/Hopetoun_falls.jpg")
                .into(imageView);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Picasso.get()
                         .load("https://cdn.thecollector.com/wp-content/uploads/2022/11/what-are-the-seven-wonders-of-the-natural-world.jpg")
                         .into(imageView);
             }
         });

    }
}