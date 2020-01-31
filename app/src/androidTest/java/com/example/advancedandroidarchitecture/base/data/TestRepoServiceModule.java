package com.example.advancedandroidarchitecture.base.data;

import com.example.advancedandroidarchitecture.data.RepoService;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class TestRepoServiceModule {
  @Binds
  abstract RepoService bindRepoService(TestRepoService repoService);
}
