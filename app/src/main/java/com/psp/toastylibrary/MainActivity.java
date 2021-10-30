package com.psp.toastylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.psp.androidtoastylibrary.SimpleToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShortToast = findViewById(R.id.btnShortToast);


        btnShortToast.setOnClickListener(v -> {
            SimpleToast.makeShortToast(this,"Short toast");
        });
    }
}