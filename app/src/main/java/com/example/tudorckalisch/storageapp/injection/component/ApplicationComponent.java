package com.example.tudorckalisch.storageapp.injection.component;

import android.app.Application;
import android.content.Context;

import com.example.tudorckalisch.storageapp.MyApplication;
import com.example.tudorckalisch.storageapp.injection.annotation.ApplicationContext;
import com.example.tudorckalisch.storageapp.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MyApplication myApplication);

    @ApplicationContext
    Context context();

    Application application();
}
