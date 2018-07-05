package com.example.nicholas.myapplication;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

public class App extends Application {

    public App mApp;
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        App.mContext = getApplicationContext();
        mApp = this;
    }

    public static Context getAppContext() {
        return App.mContext;
    }

    /*This is to give Compat Support for vector drawables on lower APIs*/
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
