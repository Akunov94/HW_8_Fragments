package com.example.hw_8_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class MainFragment extends Fragment {
    private Button btnOpen;
    Launcher launcher;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        launcher = (Launcher) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        btnOpen = view.findViewById(R.id.openChildF1);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                launcher.openFragmentChild();
            }
        });
        return view;
    }
}