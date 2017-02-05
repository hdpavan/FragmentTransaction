package com.tutorialsbuzz.fragmenttransaction;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivityFragment extends Fragment implements View.OnClickListener {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        view.findViewById(R.id.button01).setOnClickListener(this);
        view.findViewById(R.id.button02).setOnClickListener(this);
        view.findViewById(R.id.button03).setOnClickListener(this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) getActivity()).disableNavigationIcon();
        ((MainActivity) getActivity()).setToolbarTitle(R.string.MainFragmentTitle);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button01:
                //Move to Fragment 01
                ((MainActivity) getActivity()).showFragment(new FragmentExample1());
                break;

            case R.id.button02:
                //Move to Fragment 02
                ((MainActivity) getActivity()).showFragment(new FragmentExample2());
                break;

            case R.id.button03:
                //Move to Fragment 03
                ((MainActivity) getActivity()).showFragment(new FragmentExample3());
                break;

        }

    }
}
