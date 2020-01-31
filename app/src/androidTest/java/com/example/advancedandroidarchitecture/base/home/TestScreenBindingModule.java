package com.example.advancedandroidarchitecture.base.home;

import com.bluelinelabs.conductor.Controller;
import com.example.advancedandroidarchitecture.di.ControllerKey;
import com.example.advancedandroidarchitecture.trending.TrendingReposComponent;
import com.example.advancedandroidarchitecture.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TrendingReposComponent.class,
})
public abstract class TestScreenBindingModule {
    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller>
    bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
