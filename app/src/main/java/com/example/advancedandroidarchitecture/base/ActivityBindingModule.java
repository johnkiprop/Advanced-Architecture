package com.example.advancedandroidarchitecture.base;

import android.app.Activity;

import com.example.advancedandroidarchitecture.home.MainActivity;
import com.example.advancedandroidarchitecture.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents =  {
        MainActivityComponent.class,
})
public abstract class ActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    provideMainActivityInjector (MainActivityComponent.Builder builder);

}
