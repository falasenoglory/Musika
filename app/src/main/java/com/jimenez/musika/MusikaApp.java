package com.jimenez.musika;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by Shanyl Jimenez on 5/21/2016.
 */
public class MusikaApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());




    }

}
