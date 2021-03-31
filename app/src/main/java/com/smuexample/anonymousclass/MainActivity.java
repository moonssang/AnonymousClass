package com.smuexample.anonymousclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mTtextview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mTtextview1 = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new myOnClickListener());
    }

    private class myOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            mTtextview1.setText("You clicked button1");
        }
    }
}