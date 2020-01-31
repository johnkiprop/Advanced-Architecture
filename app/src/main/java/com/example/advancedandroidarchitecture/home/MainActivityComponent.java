package com.example.advancedandroidarchitecture.home;

import com.example.advancedandroidarchitecture.di.ActivityScope;
import com.example.advancedandroidarchitecture.ui.NavigationModule;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = {
        MainScreenBindingModule.class,
        NavigationModule.class,
})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{
        /*Overriding seedInstance prevents anyone from injecting MainActivity which leads to memory leaks
          as the overridden seedInstance doesn't have a @bindsInstance annotation
         */
        @Override
        public void seedInstance(MainActivity instance) {

        }
    }
}
