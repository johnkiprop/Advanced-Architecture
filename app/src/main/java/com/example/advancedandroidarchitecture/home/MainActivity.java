package com.example.advancedandroidarchitecture.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bluelinelabs.conductor.Controller;
import com.example.advancedandroidarchitecture.R;
import com.example.advancedandroidarchitecture.base.BaseActivity;
import com.example.advancedandroidarchitecture.trending.TrendingReposController;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
