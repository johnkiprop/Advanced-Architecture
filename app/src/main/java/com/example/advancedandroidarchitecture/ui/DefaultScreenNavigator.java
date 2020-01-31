package com.example.advancedandroidarchitecture.ui;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.example.advancedandroidarchitecture.di.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class DefaultScreenNavigator implements ScreenNavigator {
    private Router router;
    @Inject
    public DefaultScreenNavigator() {
    }

    @Override
    public void initWithRouter(Router router, Controller routeScreen) {
     this.router = router;
     if (!router.hasRootController()){
         router.setRoot(RouterTransaction.with(routeScreen));
     }
    }

    @Override
    public boolean pop() {
        return router != null && router.handleBack();
    }

    @Override
    public void clear() {
      router = null;
    }
}
