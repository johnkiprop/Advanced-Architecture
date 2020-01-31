package com.example.advancedandroidarchitecture.base;

import com.example.advancedandroidarchitecture.data.RepoServiceModule;
import com.example.advancedandroidarchitecture.networking.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class,
})
public interface ApplicationComponent {

    void inject(MyApplication myApplication);
}
