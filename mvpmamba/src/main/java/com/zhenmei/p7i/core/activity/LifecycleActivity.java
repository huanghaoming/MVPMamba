package com.zhenmei.p7i.core.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.trello.rxlifecycle2.android.ActivityEvent;
import com.zhenmei.p7i.core.integration.lifecycle.ActivityLifecycleable;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;


public class LifecycleActivity extends AppCompatActivity implements ActivityLifecycleable {
    private final BehaviorSubject<ActivityEvent> mLifecycleSubject = BehaviorSubject.create();

    @NonNull
    @Override
    public Subject<ActivityEvent> provideLifecycleSubject() {
        return mLifecycleSubject;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


}
