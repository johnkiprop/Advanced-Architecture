package com.example.advancedandroidarchitecture.trending;

import com.example.advancedandroidarchitecture.R;
import com.example.advancedandroidarchitecture.di.ScreenScope;
import com.example.advancedandroidarchitecture.models.Repo;
import com.jakewharton.rxrelay2.BehaviorRelay;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import timber.log.Timber;

@ScreenScope
 class TrendingReposViewModel {
    private final BehaviorRelay<List<Repo>> reposRelay = BehaviorRelay.create();
    private final BehaviorRelay<Integer> errorRelay = BehaviorRelay.create();
    private final BehaviorRelay<Boolean> loadingRelay = BehaviorRelay.create();
    @Inject
    public TrendingReposViewModel() {
    }
    Observable<Boolean> loading(){
        return loadingRelay;
    }
    Observable<List<Repo>> repos(){
        return reposRelay;
    }
    Observable<Integer> error(){
        return errorRelay;
    }
    Consumer<Boolean> loadingUpdated(){
     return loadingRelay;
    }
    Consumer<List<Repo>> reposUpdated(){
        //next line is for hiding error if it existed and user refreshed and the next call was successful
        errorRelay.accept(-1);
       return  reposRelay;
    }
    Consumer<Throwable> onError(){
        return throwable ->{
            Timber.e(throwable, "Error loading Repos");
            errorRelay.accept(R.string.api_error_repos);
        };
    }
}
