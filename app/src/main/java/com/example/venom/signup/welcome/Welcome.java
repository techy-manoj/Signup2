package com.example.venom.signup.welcome;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.venom.signup.R;

public class Welcome extends BaseActivity implements View.OnClickListener {

    @Override
    public void onActivityCreated() {
        onButtonClick();
        setText();
        // to change the title of activity
        setTitle("Welcome Activity");
        // to add back button in activity on toolbar
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setHomeButtonEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (android.R.id.home == item.getItemId()) {
            // Both the method are used to exit from current activity.
            //finish();
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_welcome;
    }

    private void onButtonClick() {
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        findViewById(R.id.textView_2).setOnClickListener(this);
        // below method is annonums class
// btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // wrong method to go back it is for going forward
//                Intent intent = new Intent(Welcome.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });


    }

    // This is button method is defined in activity_welcome.xml for click event.
    // mostly used method , This can not be used in fragment.
    public void onMyNameClick(View v) {
        Toast.makeText(this, "I am on MyNameClick", Toast.LENGTH_SHORT).show();
    }


    private void setText() {
        TextView textView = findViewById(R.id.textView_2);
        textView.setText(R.string.nextScreen);

    }

    @Override
    public void onClick(View v) {
        if (R.id.button2 == v.getId())
            Toast.makeText(this, "Hello Button", Toast.LENGTH_SHORT).show();
        if (R.id.textView_2 == v.getId())
            Toast.makeText(this, "Hello Text", Toast.LENGTH_SHORT).show();
    }
}
