package com.example.learndagger.di.module;

import android.content.Context;
import android.content.Intent;

import com.example.learndagger.MyApplication;
import com.example.learndagger.data.local.DatabaseService;
import com.example.learndagger.data.remote.NetworkService;
import com.example.learndagger.di.qualifier.DatabaseInfo;
import com.example.learndagger.di.qualifier.NetworkInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private MyApplication myApplication;

    public ApplicationModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Provides
    Context provideContext(){

        return myApplication;
    }

    @DatabaseInfo
    @Provides
    String provideDatabaseName(){

        return "abc";
    }

    @Provides
    Integer provideDatabaseVersion(){

        return 1;
    }

    @NetworkInfo
    @Provides
    String provideNetworkApiKey(){

        return "xyz";
    }

    /*@Singleton
    @Provides
    NetworkService provideNetworkService(){

        return new NetworkService(myApplication, "xyz");
    }

    @Singleton
    @Provides
    DatabaseService provideDatabaseService(){

        return new DatabaseService(myApplication, "abc", 1);
    }*/


}
