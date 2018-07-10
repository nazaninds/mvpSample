package com.example.nazanin.mvpsample.dagger.component;

import android.content.Context;
import android.content.res.Resources;

import com.example.nazanin.mvpsample.MainActivity;
import com.example.nazanin.mvpsample.dagger.BaseActivity;
import com.example.nazanin.mvpsample.dagger.annotation.ActivityContext;
import com.example.nazanin.mvpsample.dagger.module.ActivityModule;
import com.example.nazanin.mvpsample.dagger.annotation.ActivityScope;

import dagger.Component;

/**
 * Created by Nazanin Dastserri on 7/9/18
 * Email  : nazanin.ds@gmail.com
 **/
@ActivityScope
@Component(
        dependencies = ApplicationComponent.class,
        modules = { ActivityModule.class })
public interface ActivityComponent {

    @ActivityContext
    Context getContext();

    Resources getResources();

    void inject(BaseActivity baseActivity);
}
