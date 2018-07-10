package com.example.nazanin.mvpsample.dagger.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Nazanin Dastserri on 7/9/18
 * Email  : nazanin.ds@gmail.com
 **/
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
}
