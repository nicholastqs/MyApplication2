package com.example.nicholas.myapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.nicholas.myapplication.R;

/*This is a typical example of how how to create a base activity for our Application.
* Base activity allows us implement methods that we will need in multiple activities
 * instead on writing same code all over again*/

public class BaseActivity extends AppCompatActivity {

    public Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    public void addToolbar() {
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolbar.setNavigationOnClickListener(v -> onNavigateUp());
    }
}
