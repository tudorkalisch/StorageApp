package com.example.tudorckalisch.storageapp.common;

import android.support.v7.app.AppCompatActivity;

import com.example.tudorckalisch.storageapp.MyApplication;
import com.example.tudorckalisch.storageapp.common.mvp.MvpView;
import com.example.tudorckalisch.storageapp.injection.component.ActivityComponent;
import com.example.tudorckalisch.storageapp.injection.component.DaggerActivityComponent;
import com.example.tudorckalisch.storageapp.injection.module.ActivityModule;

public class BaseActivity extends AppCompatActivity implements MvpView {
    private ActivityComponent mActivityComponent;

    public ActivityComponent activityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(MyApplication.get(this).getComponent())
                    .build();
        }
        return mActivityComponent;
    }
}
