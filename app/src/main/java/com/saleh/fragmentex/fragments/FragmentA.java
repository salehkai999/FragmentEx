package com.saleh.fragmentex.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saleh.fragmentex.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */

/*
 *   Fragments can be added through android studio Right click on a package new -> fragments ->  blank fragments
 *   keep in mind it'll implement different methods with parameters, weren't using them so restructure the class.
 */
public class FragmentA extends Fragment {



    public FragmentA() {
        // Required empty public constructor
    }

    public static FragmentA newInstance() {
        FragmentA fragment = new FragmentA();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}