package com.bw.proj1909zg6;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * @author hahajing 企鹅：444511958
 * @version 1.0.0
 * @createDate 2022/4/19 11:18
 * @description
 * @updateUser hahajing
 * @updateDate 2022/4/19 11:18
 * @updateRemark
 */
public class BasePersenter implements DefaultLifecycleObserver {
    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onStop(owner);
        //暂停更新UI
        Log.d("123", "onStop: stop update ui");
    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onCreate(owner);
        Log.d("123", "onCreate: ....");
    }
}
