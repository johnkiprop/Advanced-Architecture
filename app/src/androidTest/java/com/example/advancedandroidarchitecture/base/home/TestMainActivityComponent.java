package com.example.advancedandroidarchitecture.base.home;

import com.example.advancedandroidarchitecture.di.ActivityScope;
import com.example.advancedandroidarchitecture.home.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = {TestScreenBindingModule.class, } )
public interface TestMainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}
