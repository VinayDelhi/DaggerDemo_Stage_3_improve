package com.example.learndagger.ui;


import com.example.learndagger.data.local.DatabaseService;
import com.example.learndagger.data.remote.NetworkService;
import com.example.learndagger.di.Scope.ActivityScop;

import javax.inject.Inject;

@ActivityScop
public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    @Inject
    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
