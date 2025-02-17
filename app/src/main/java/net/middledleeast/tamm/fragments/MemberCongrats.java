package net.middledleeast.tamm.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import net.middledleeast.tamm.R;
import net.middledleeast.tamm.activities.RenewAccount;

public class MemberCongrats extends Fragment {

    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.member_congrats, container, false);

        button=view.findViewById(R.id.continueTo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext() , RenewAccount.class));
            }
        });


        return view;

    }
}
