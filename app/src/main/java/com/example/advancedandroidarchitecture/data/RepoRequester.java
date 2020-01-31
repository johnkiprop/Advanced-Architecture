package com.example.advancedandroidarchitecture.data;

import com.example.advancedandroidarchitecture.models.Repo;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class RepoRequester {
    private final RepoService repoService;

    @Inject
    RepoRequester(RepoService repoService){
        this.repoService = repoService;
    }

   public Single<List<Repo>> getTrendingRepos(){
        return repoService.getTrendingRepos()
                .map(TrendingReposResponse::repos)
                .subscribeOn(Schedulers.io());
    }
}
