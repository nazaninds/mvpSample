package com.example.nazanin.mvpsample.dagger.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

import com.bumptech.glide.load.engine.Resource;
import com.example.nazanin.mvpsample.dagger.annotation.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nazanin Dastserri on 7/9/18
 * Email  : nazanin.ds@gmail.com
 **/
@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(final Activity activity) {
        mActivity = activity;
    }

    @Provides
    public Activity provideActivity() {
        return mActivity;
    }

    @Provides
    @ActivityContext
    public Context provideActivityContext() {
        return mActivity;
    }

    @Provides
    public Resources provideResources(){
        return mActivity.getResources();
    }

}
