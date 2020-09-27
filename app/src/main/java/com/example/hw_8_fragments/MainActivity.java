package com.example.hw_8_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements Launcher {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void openFragmentChild() {
        fragmentManager = getSupportFragmentManager();
        ChildFragment childFragment = new ChildFragment();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.startFragment, childFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void goHome() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                fragmentManager = getSupportFragmentManager();
                MainFragment mainFragment = new MainFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.startFragment, mainFragment);
                fragmentTransaction.commit();
            }
        }, 5000);
    }
}