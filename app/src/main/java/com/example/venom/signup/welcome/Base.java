package com.example.venom.signup.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.venom.signup.MainActivity;
import com.example.venom.signup.R;

public abstract class Base extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
            setText();
            onButtonClick();
    }

    public abstract void onButtonClick();
     public abstract void setText();

     public abstract int getLayout();
}
