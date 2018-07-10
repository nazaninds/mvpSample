package com.example.nazanin.mvpsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nazanin.mvpsample.dagger.BaseActivity;
import com.example.nazanin.mvpsample.dagger.annotation.ActivityContext;
import com.example.nazanin.mvpsample.dagger.component.ActivityComponent;
import com.example.nazanin.mvpsample.dagger.component.DaggerActivityComponent;
import com.example.nazanin.mvpsample.dagger.module.ActivityModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.text)
    TextView text;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ButterKnife.bind(this);


        text.setText("Hi dagger 2");
        text.setTextColor(resources.getColor(R.color.colorAccent));

    }


}
