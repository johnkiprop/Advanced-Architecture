package com.example.advancedandroidarchitecture.trending;

import com.example.advancedandroidarchitecture.data.RepoRequester;
import com.example.advancedandroidarchitecture.di.ScreenScope;
import com.example.advancedandroidarchitecture.models.Repo;

import javax.inject.Inject;

@ScreenScope
class TrendingReposPresenter implements RepoAdapter.RepoClickedListener {
    private final TrendingReposViewModel viewModel;
    private  RepoRequester requester;

    @Inject
    public TrendingReposPresenter(TrendingReposViewModel viewModel, RepoRequester requester) {

        this.viewModel = viewModel;
        this.requester = requester;
        loadRepos();

    }

    private void loadRepos() {
        requester.getTrendingRepos()
                .doOnSubscribe(__ ->viewModel.loadingUpdated().accept(true))
                .doOnEvent((d, t) -> viewModel.loadingUpdated().accept(false))
                .subscribe(viewModel.reposUpdated(), viewModel.onError());
    }


    @Override
    public void onRepoClicked(Repo repo) {

    }
}
