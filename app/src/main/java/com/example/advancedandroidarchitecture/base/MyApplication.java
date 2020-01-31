package com.example.advancedandroidarchitecture.base;

import android.app.Application;

import com.example.advancedandroidarchitecture.BuildConfig;
import com.example.advancedandroidarchitecture.di.ActivityInjector;

import javax.inject.Inject;

import timber.log.Timber;

public class MyApplication extends Application {
    protected ApplicationComponent component;
    @Inject ActivityInjector activityInjector;
    @Override
    public void onCreate() {
        super.onCreate();
    component = initComponent();
            component.inject(this);
            if (BuildConfig.DEBUG){
                Timber.plant(new Timber.DebugTree());
            }
    }
    //create a protected class so TestApplication can access another component created
    protected ApplicationComponent initComponent(){
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
