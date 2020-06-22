package com.example.leakcanatrytester;

import android.content.Context;

public class SingletonManager {

    private static SingletonManager singleton;
    private Context context;

    private SingletonManager(Context context) {
        this.context = context;
    }

    public synchronized static SingletonManager getInstance(Context context) {
        if (singleton == null) {
            singleton = new SingletonManager(context);
        }
        return singleton;
    }
}