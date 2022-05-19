package com.quentinrouet.androkado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.quentinrouet.androkado.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main);


        Article painAuChocolat = new Article("Chocolatine",
                "Viennoiserie au beurre et cocolat",
                "https://wikipedia.org/wiki/Pain_au_chocolat",
                1.5f,
                3.0f,
                true);

        amb.setArticle(painAuChocolat);
    }
}