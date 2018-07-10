package com.example.nazanin.mvpsample.dagger;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.nazanin.mvpsample.App;
import com.example.nazanin.mvpsample.dagger.annotation.ActivityContext;
import com.example.nazanin.mvpsample.dagger.component.ActivityComponent;
import com.example.nazanin.mvpsample.dagger.component.DaggerActivityComponent;
import com.example.nazanin.mvpsample.dagger.module.ActivityModule;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by Nazanin Dastserri on 7/9/18
 * Email  : nazanin.ds@gmail.com
 **/

public class BaseActivity extends AppCompatActivity {
    @Inject
    @ActivityContext
    public Context context;

    @Inject
    public Resources resources;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ButterKnife.bind(this);
        initInjector();

    }


    private void initInjector() {
        ActivityComponent component = DaggerActivityComponent.builder()
                .applicationComponent(App.getComponent())
                .activityModule(new ActivityModule(this)).build();
        component.inject(this);
    }
}
