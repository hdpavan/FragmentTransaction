package com.tutorialsbuzz.fragmenttransaction;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentExample1 extends Fragment implements View.OnClickListener {

    public FragmentExample1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_example_1, container, false);

        view.findViewById(R.id.btn_f1_01).setOnClickListener(this);
        view.findViewById(R.id.btn_f1_02).setOnClickListener(this);

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) getActivity()).setToolbarTitle(R.string.Fragment01Title);
        ((MainActivity) getActivity()).enableNavigationIcon();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_f1_01:
                //Move to Fragment 02
                ((MainActivity) getActivity()).showFragment(new FragmentExample2());
                break;

            case R.id.btn_f1_02:
                //Move to Fragment 03
                ((MainActivity) getActivity()).showFragment(new FragmentExample3());
                break;
        }
    }
}
