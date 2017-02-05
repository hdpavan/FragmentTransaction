package com.tutorialsbuzz.fragmenttransaction;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentExample2 extends Fragment {

    public FragmentExample2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_example_2, container, false);

        view.findViewById(R.id.btn_f2_01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //move to fragment3
                ((MainActivity) getActivity()).showFragment(new FragmentExample3());
            }
        });

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) getActivity()).enableNavigationIcon();
        ((MainActivity) getActivity()).setToolbarTitle(R.string.Fragment02Title);
    }
}
