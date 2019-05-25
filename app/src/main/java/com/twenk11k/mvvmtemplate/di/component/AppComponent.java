package com.twenk11k.mvvmtemplate.di.component;

import android.app.Application;

import com.twenk11k.mvvmtemplate.App;
import com.twenk11k.mvvmtemplate.di.module.ActivityModule;
import com.twenk11k.mvvmtemplate.di.module.AppModule;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityModule.class})
public interface AppComponent {

    void inject(App app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
