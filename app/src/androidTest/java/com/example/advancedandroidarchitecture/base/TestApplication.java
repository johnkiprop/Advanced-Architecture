package com.example.advancedandroidarchitecture.base;

public class TestApplication extends MyApplication {
    @Override
    protected ApplicationComponent initComponent() {
        return DaggerTestApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
