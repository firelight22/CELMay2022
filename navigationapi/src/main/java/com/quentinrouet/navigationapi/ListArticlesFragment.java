package com.quentinrouet.navigationapi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ListArticlesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Interpréter le layout pour en faire une vue (qui est le seul élément compréhensible par Java)
        return inflater.inflate(R.layout.fragment_list_articles, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rvArticles  = view.findViewById(R.id.recyclerViewArticles);
        ArrayList<Article> alArticles = new ArrayList<Article>();
        alArticles.add(new Article("Chocolatine",
                "Viennoiserie au beurre et cocolat",
                "https://wikipedia.org/wiki/Pain_au_chocolat",
                1.5f,
                3.0f,
                true));
        alArticles.add(new Article("MacBook Prto 16",
                "Oridnateur très cher avec pas beauocup de disque dur",
                "https://apple.com/macbookpro",
                35000.0f,
                3.0f,
                false));
        alArticles.add(new Article("Paris-brest",
                "viennoiserie :D",
                "https://wikipedia.org/wiki/Paris_brest",
                2.0f,
                3.0f,
                true));
        rvArticles.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rvArticles.setAdapter(new ArticleAdapter(alArticles, new ArticleAdapter.OnArticleClickListener() {
            @Override
            public void onArticleCLicked(Article article) {

            }
        }));
    }
}