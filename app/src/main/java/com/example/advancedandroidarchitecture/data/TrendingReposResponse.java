package com.example.advancedandroidarchitecture.data;

import com.example.advancedandroidarchitecture.models.Repo;
import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

@AutoValue
public abstract class TrendingReposResponse {
    @Json(name = "items")
   public abstract List<Repo> repos();
    public static JsonAdapter<TrendingReposResponse> jsonAdapter(Moshi moshi){
        return new AutoValue_TrendingReposResponse.MoshiJsonAdapter(moshi);
    }
}
