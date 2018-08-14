package com.example.tudorckalisch.storageapp.injection.component;

import com.example.tudorckalisch.storageapp.injection.annotation.PerActivity;
import com.example.tudorckalisch.storageapp.injection.module.ActivityModule;

import net.hockeyapp.android.LoginActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules =  ActivityModule.class)
public interface ActivityComponent {
    void inject(LoginActivity loginActivity);
}
