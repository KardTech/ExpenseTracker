package com.kard.expensetracker.interfaces;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;

/**
 * Created by Raghu Datta on 13/04/2017.
 */
public interface IFragmentListener {

    void replaceFragment(Fragment fragment, boolean addToBackStack);
    void replaceFragment(int containerId, Fragment fragment, boolean addToBackStack);
    void setResultWithData(int status, Intent intent);
    void setToolbar(Toolbar toolbar);
    void closeActivity();

}
