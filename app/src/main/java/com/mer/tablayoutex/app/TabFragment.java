package com.mer.tablayoutex.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mer.tablayoutex.R;

import androidx.fragment.app.Fragment;

public class TabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tab, container, false);
        final TextView textView = root.findViewById(R.id.tvtext);
        textView.setText("Fragment : " + getArguments().getInt("index"));
        return root;
    }
}
