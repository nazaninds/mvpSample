package com.example.nazanin.mvpsample.dagger.component;

import android.app.Application;
import android.content.Context;

import com.example.nazanin.mvpsample.dagger.annotation.ApplicationContext;
import com.example.nazanin.mvpsample.dagger.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by Nazanin Dastserri on 7/7/18
 * Email  : nazanin.ds@gmail.com
 **/

@Singleton @Component(modules = { ApplicationModule.class })
public interface ApplicationComponent {

    @ApplicationContext
    Context getContext();

    void inject(Application application);

}
