package com.kard.expensetracker;

import android.app.Application;
import android.content.Context;

/**
 * Created by Raghu Datta on 13/04/2017.
 */
public class ExpenseTrackerApp extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }

}
