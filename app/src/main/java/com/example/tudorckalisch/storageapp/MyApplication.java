package com.example.tudorckalisch.storageapp;

import android.app.Application;
import android.content.Context;

import com.example.tudorckalisch.storageapp.injection.component.ApplicationComponent;
import com.example.tudorckalisch.storageapp.injection.component.DaggerApplicationComponent;
import com.example.tudorckalisch.storageapp.injection.module.ApplicationModule;
import com.facebook.stetho.Stetho;

public class MyApplication extends Application{
    private ApplicationComponent mApplicationComponent;

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
}
