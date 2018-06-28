package com.example.venom.signup.welcome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        onActivityCreated();
    }

    // we will create generic method
    // onActivityCreated
    /* abstract method used for buttonClick Listener */
    public abstract void onActivityCreated();

    /* abstract method used for setText in TextView */
    //public abstract void setText();
    /* abstract method used for return layout */
    public abstract int getLayout();
}
