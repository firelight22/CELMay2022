package com.quentinrouet.androkado;

/**
 * Created by quentin for CELMay2022 on 19/05/2022.
 */
public class Article {
   String nom,description, url; //null
   float prix,degreEnvie; //0f
   boolean isAchete; // false

   public Article(String nom, String description, String url, float prix, float degreEnvie, boolean isAchete) {
      this.nom = nom;
      this.description = description;
      this.url = url;
      this.prix = prix;
      this.degreEnvie = degreEnvie;
      this.isAchete = isAchete;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public float getPrix() {
      return prix;
   }

   public void setPrix(float prix) {
      this.prix = prix;
   }

   public float getDegreEnvie() {
      return degreEnvie;
   }

   public void setDegreEnvie(float degreEnvie) {
      this.degreEnvie = degreEnvie;
   }

   public boolean isAchete() {
      return isAchete;
   }

   public void setAchete(boolean achete) {
      isAchete = achete;
   }
}

