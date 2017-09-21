package com.example.administrator.fragmenttest3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 *
 */
public class DefinitionFragment extends Fragment {
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;
    TextView def;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }

        View fragmentView = inflater.inflate(R.layout.fragment_definition, container, false);
        def = (TextView) fragmentView.findViewById(R.id.definition);
        return fragmentView;
    }



}
