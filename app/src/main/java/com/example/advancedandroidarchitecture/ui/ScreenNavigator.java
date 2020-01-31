package com.example.advancedandroidarchitecture.ui;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;

public interface ScreenNavigator {
    
    void initWithRouter(Router router, Controller routeScreen);

    boolean pop();

    void clear();
}
