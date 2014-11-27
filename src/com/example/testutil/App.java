package com.example.testutil;

import android.app.Application;

/**
 * Created by max on 21.11.2014.
 */
public class App extends Application {
    private static LogHelper Log = new LogHelper(App.class);

    public static App instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable ex) {
                Log.e("Unhandled ", ex);
            }
        });


        Log.d("Application start");
    }
}
