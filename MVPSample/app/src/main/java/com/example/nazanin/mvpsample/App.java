package com.example.nazanin.mvpsample;

import android.app.Application;

import com.example.nazanin.mvpsample.dagger.component.ApplicationComponent;
import com.example.nazanin.mvpsample.dagger.component.DaggerApplicationComponent;
import com.example.nazanin.mvpsample.dagger.module.ApplicationModule;


/**
 * Created by Nazanin Dastserri on 7/7/18
 * Email  : nazanin.ds@gmail.com
 **/

public class App extends Application {

    private static volatile ApplicationComponent component;

    public static synchronized ApplicationComponent getComponent() {
        return component;
    }
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().
                applicationModule(new ApplicationModule(this)).build();
    }


}
