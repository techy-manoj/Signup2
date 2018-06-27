package com.example.venom.signup.welcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.venom.signup.R;

public class Welcome extends Base {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @Override
    public int getLayout() {
        return R.layout.activity_welcome;
    }

    @Override
    public void onButtonClick() {

    }

    @Override
    public void setText() {
        TextView textView = findViewById(R.id.textView_2);
        textView.setText("Welcome to next Screen");

    }
}
