package com.example.advancedandroidarchitecture.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;
import com.example.advancedandroidarchitecture.di.Injector;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BaseController extends Controller {
        private boolean injected= false;
        private final CompositeDisposable disposables = new CompositeDisposable();
        private Unbinder unbinder;

    @Override
        protected void onContextAvailable(@NonNull Context context) {
            /*Controller instances are retained across config changes
            * so this method can be called more than once
            * sure we don't waste time injecting more than once, though technically it
            * wouldn't change functionality*/
            if (!injected){
                Injector.inject(this);
                injected= true;
            }
            super.onContextAvailable(context);

        }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(layoutRes(), container, false);
        unbinder= ButterKnife.bind(this, view);
        onViewBound(view);
        disposables.addAll(subscriptions());
        return view;
    }

    @Override
    protected void onDestroy() {
        /*
        We use disposables.clear() because    disposables.dispose() will prevent us from re-using the
        CompositeDisposable again which will get re-used multiple times again when view undergoes
         configuration changes
         */
        disposables.clear();
        if (unbinder != null) {
            unbinder.unbind();
            unbinder =null;
        }
    }

    protected void onViewBound(View view){

        }
        protected Disposable[] subscriptions(){
                return new Disposable[0];
    }
        @LayoutRes
         protected abstract int layoutRes();
    }
