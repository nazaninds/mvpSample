package com.example.nazanin.mvpsample.dagger.module;

import android.app.Application;
import android.content.Context;

import com.example.nazanin.mvpsample.dagger.annotation.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nazanin Dastserri on 7/7/18
 * Email  : nazanin.ds@gmail.com
 **/

@Module  public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(final Application application) {
        mApplication = application;
    }

    @Provides
    public Application provideApplication(){return mApplication;}

    @Provides @ApplicationContext
    Context provideApplicationContext(){
        return mApplication;
    }
}
