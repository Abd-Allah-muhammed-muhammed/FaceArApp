package net.middledleeast.tamm.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.middledleeast.tamm.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSeats extends Fragment {


    public FragmentSeats() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_seats, container, false);
    }

}
