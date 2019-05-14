package com.example.learndagger.di.component;

import com.example.learndagger.MyApplication;
import com.example.learndagger.data.local.DatabaseService;
import com.example.learndagger.data.remote.NetworkService;
import com.example.learndagger.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication myApplication);

    NetworkService provideNetworkService();
    DatabaseService provideDatabaseService();
}
