package com.quentinrouet.androkado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoUrlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_url);
        Article article = getIntent().getParcelableExtra(MainActivity.KEY_ARTICLE);
        TextView textViewUrl = findViewById(R.id.textViewUrl);
        textViewUrl.setText(article.getUrl());
    }
}