package com.example.tudorckalisch.storageapp.common;

import com.example.tudorckalisch.storageapp.common.mvp.MvpPresenter;
import com.example.tudorckalisch.storageapp.common.mvp.MvpView;

public class BasePresenter<T extends MvpView> implements MvpPresenter<T> {
    private T view;

    @Override
    public void attachView(T mvpView) {
        view = mvpView;
    }

    @Override
    public void detachView() {
        view = null;
    }

    private boolean isViewAttached() {
        return view != null;
    }

    public T getView() {
        return view;
    }
}
