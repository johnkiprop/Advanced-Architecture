package com.example.advancedandroidarchitecture.home;


import com.bluelinelabs.conductor.Controller;
import com.example.advancedandroidarchitecture.di.ControllerKey;
import com.example.advancedandroidarchitecture.trending.TrendingReposComponent;
import com.example.advancedandroidarchitecture.trending.TrendingReposController;

import dagger.Binds;
import dagger.MapKey;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TrendingReposComponent.class,
})
public abstract class MainScreenBindingModule {
    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller>
    bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
