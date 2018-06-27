package com.example.venom.signup.welcome;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.venom.signup.MainActivity;
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
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void setText() {
        TextView textView = findViewById(R.id.textView_2);
        textView.setText(R.string.nextScreen);

    }
}
