package com.quentinrouet.navigationapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by quentin for CELMay2022 on 23/05/2022.
 */
public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleVH> {
   ArrayList<Article> data;
   OnArticleClickListener listener;

   public ArticleAdapter(ArrayList<Article> data, OnArticleClickListener listener) {
      this.data = data;
      this.listener = listener;
   }

   class ArticleVH extends RecyclerView.ViewHolder {
      TextView textViewTitre;
      TextView textViewPrix;
      public ArticleVH(@NonNull View itemView) {
         //Item view c'est template_article.xml transformé en vue
         super(itemView);
         textViewTitre = itemView.findViewById(R.id.textViewTitre);
         textViewPrix = itemView.findViewById(R.id.textViewPrix);
      }
   }

   @NonNull
   @Override
   public ArticleVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View itemView = LayoutInflater.from(parent.getContext()).inflate(
              R.layout.template_article,
              parent,
              false);
      return new ArticleVH(itemView);
   }

   //J'ai un holder (vue) et j'ai la position "position". Je fais quoi ?
   @Override
   public void onBindViewHolder(@NonNull ArticleVH holder, int position) {
      Article articleToShow = data.get(position);
      holder.itemView.setOnClickListener(v -> listener.onArticleCLicked(articleToShow));
      holder.textViewTitre.setText(articleToShow.nom);
      holder.textViewPrix.setText(String.valueOf(articleToShow.prix));
   }

   @Override
   public int getItemCount() {
      return data.size();
   }
   public interface OnArticleClickListener{
      public void onArticleCLicked(Article article);
   }
}
