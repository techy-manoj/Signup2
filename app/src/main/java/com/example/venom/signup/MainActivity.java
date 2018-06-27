package com.example.venom.signup;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.venom.signup.welcome.Base;
import com.example.venom.signup.welcome.Welcome;

public class MainActivity extends Base{
    @Override
    public void onButtonClick() {
        Button button = findViewById(R.id.btn_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Welcome.class);
                startActivity(intent);
                }
                });
            }

    @Override
    public void setText() {
        TextView textView = findViewById(R.id.textView_1);
        textView.setText("Welcome to MainActivity");
        Toast.makeText(getApplicationContext(),"Welcome to SignUp",Toast.LENGTH_SHORT).show();

    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }
}
