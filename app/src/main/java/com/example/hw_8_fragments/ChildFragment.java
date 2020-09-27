package com.example.hw_8_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ChildFragment extends Fragment {
    private Button btnGoHome;
    Launcher launcher;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        launcher = (Launcher) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_child, container, false);
        btnGoHome = view.findViewById(R.id.btnGoHome);
        btnGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.goHome();
            }
        });
        return view;
    }
}