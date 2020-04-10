package com.example.toastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Application Started.",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Application Closed.",Toast.LENGTH_LONG).show();
    }
}
