package com.example.examen_egrao;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity implements TrainingSeriesFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = new TrainingSeriesFragment();
//        FragmentManager fragmentmanager = getFragmentManager();
//        fragmentmanager.beginTransaction().show(fragment).commit();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment,"uwu");
        transaction.addToBackStack(null);
        transaction.commit();

    }

//    public void verDialog(View view) {
//
//    }

    @Override
    public void itemClicked(long id) {

    }
}