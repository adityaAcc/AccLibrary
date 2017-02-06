package com.acc.apilibrary;

import android.support.multidex.MultiDexApplication;
import android.util.Log;

/**
 * Created by Aditya Chowta on 2/6/2017.
 */

public class Application extends MultiDexApplication {
    private final static String LOG_TAG = Application.class.getSimpleName();
    @Override
    public void onCreate() {
        Log.d(LOG_TAG, "Application.onCreate - Initializing application...");
        super.onCreate();
        Log.d(LOG_TAG, "Application.onCreate - Application initialized OK");
    }
}
