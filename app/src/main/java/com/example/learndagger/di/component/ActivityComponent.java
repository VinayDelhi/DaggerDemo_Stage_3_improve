package com.example.learndagger.di.component;

import com.example.learndagger.di.Scope.ActivityScop;
import com.example.learndagger.di.module.ActivityModule;
import com.example.learndagger.ui.MainActivity;

import dagger.Component;

@ActivityScop
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
