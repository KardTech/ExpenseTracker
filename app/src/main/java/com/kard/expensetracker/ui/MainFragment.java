package com.kard.expensetracker.ui;

import android.content.Context;

import com.kard.expensetracker.interfaces.IMainActivityListener;

/**
 * Created by Raghu Datta on 13/04/2017.
 */
public class MainFragment extends BaseFragment {

    protected IMainActivityListener mMainActivityListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mMainActivityListener = (IMainActivityListener)context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mMainActivityListener = null;
    }

}
