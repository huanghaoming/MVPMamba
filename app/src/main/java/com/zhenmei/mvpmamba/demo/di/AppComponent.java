package com.zhenmei.mvpmamba.demo.di;

import com.zhenmei.mvpmamba.demo.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        BuildersModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {

        AppComponent build();


        @BindsInstance
        Builder application(BaseApplication application);

    }

    void inject(BaseApplication app);

}
