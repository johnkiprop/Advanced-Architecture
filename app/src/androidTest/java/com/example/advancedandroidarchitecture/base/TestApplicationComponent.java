package com.example.advancedandroidarchitecture.base;

import com.example.advancedandroidarchitecture.base.data.TestRepoServiceModule;
import com.example.advancedandroidarchitecture.networking.ServiceModule;
import com.example.advancedandroidarchitecture.ui.NavigationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        TestActivityBindingModule.class,
        TestRepoServiceModule.class,
        ServiceModule.class,
        NavigationModule.class,
})
public interface TestApplicationComponent extends ApplicationComponent{

}
