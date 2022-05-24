package com.quentinrouet.demookhttp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Créer mon client OkHttp
        OkHttpClient client = new OkHttpClient();
        //Créer ma requête
        Request swapi = new Request.Builder().url("https://swapi.dev/api/people/1").build();
        //Executer ma requête
        client.newCall(swapi).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                String body = response.body().string();
                Log.i(TAG, "onResponse: " + body );
                try {
                    JSONObject luke = new JSONObject(body);
                    String nom = luke.getString("name");
                    Log.i(TAG, "onResponse: " + nom );

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}