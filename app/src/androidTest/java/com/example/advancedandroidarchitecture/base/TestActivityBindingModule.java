package com.example.advancedandroidarchitecture.base;

import android.app.Activity;

import com.example.advancedandroidarchitecture.base.home.TestMainActivityComponent;
import com.example.advancedandroidarchitecture.home.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = TestMainActivityComponent.class)
public  abstract class TestActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector<? extends Activity> bindMainActivityInjector(TestMainActivityComponent.Builder builder);
}
