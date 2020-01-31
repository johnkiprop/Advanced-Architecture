package com.example.advancedandroidarchitecture.base.data;

import com.example.advancedandroidarchitecture.data.RepoService;
import com.example.advancedandroidarchitecture.data.TrendingReposResponse;

import javax.inject.Inject;

import io.reactivex.Single;

public class TestRepoService implements RepoService {
    @Inject
     TestRepoService(){

    }
    @Override
    public Single<TrendingReposResponse> getTrendingRepos() {
        return null;
    }
}
