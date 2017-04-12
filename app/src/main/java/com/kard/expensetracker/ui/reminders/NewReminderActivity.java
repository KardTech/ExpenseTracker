package com.kard.expensetracker.ui.reminders;

import android.os.Bundle;

import com.kard.expensetracker.R;
import com.kard.expensetracker.interfaces.IUserActionsMode;
import com.kard.expensetracker.ui.BaseActivity;

/**
 * Created by Raghu Datta on 13/04/2017.
 */
public class NewReminderActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        @IUserActionsMode int mode = getIntent().getIntExtra(IUserActionsMode.MODE_TAG, IUserActionsMode.MODE_CREATE);
        String reminderId = getIntent().getStringExtra(NewReminderFragment.REMINDER_ID_KEY);
        replaceFragment(NewReminderFragment.newInstance(mode, reminderId), false);
    }

}
