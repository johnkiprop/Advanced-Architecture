package com.example.advancedandroidarchitecture.data;

import com.example.advancedandroidarchitecture.trending.TrendingReposComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public abstract class RepoServiceModule {
    @Provides
    @Singleton
    static RepoService provideRepoService(Retrofit retrofit){
        return retrofit.create(RepoService.class);
    }
}

