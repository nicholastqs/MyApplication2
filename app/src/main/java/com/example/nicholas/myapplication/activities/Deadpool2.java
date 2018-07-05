package com.example.nicholas.myapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.nicholas.myapplication.R;

/*We now have to extend BaseActivity here. Remember our BaseActivity
 extends AppCompatActivity so we're all good to go*/
public class Deadpool2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadpool2);

        /*Initialize toolbar in oncreate here*/
        addToolbar();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                /*This will pass the string to the toast method in BaseActivity.
                * This means you no need to create multiple Toast methods*/
                showToast("Share Clicked");
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
