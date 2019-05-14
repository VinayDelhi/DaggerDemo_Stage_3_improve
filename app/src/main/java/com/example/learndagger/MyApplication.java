package com.example.learndagger;

import android.app.Application;
import android.util.Log;

import com.example.learndagger.data.local.DatabaseService;
import com.example.learndagger.data.remote.NetworkService;
import com.example.learndagger.di.component.ApplicationComponent;
import com.example.learndagger.di.component.DaggerApplicationComponent;
import com.example.learndagger.di.module.ApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {

    public ApplicationComponent component;

    @Inject
    public DatabaseService databaseService;

    @Inject
    public NetworkService networkService;

    @Inject
    public NetworkService networkService2;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        component.inject(this);

        Log.d("DEBUG", networkService.toString());
    }
}
