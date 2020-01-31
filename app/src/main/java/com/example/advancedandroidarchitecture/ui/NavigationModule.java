package com.example.advancedandroidarchitecture.ui;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class NavigationModule {
    @Binds
    abstract ScreenNavigator provideNavigator(DefaultScreenNavigator defaultScreenNavigator);
}
