package com.example.khoytanova;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ThirdActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //return  super.onCreateView(inflater, container,savedInstanceState);
        return inflater.inflate(R.layout.third_tab,container,false);
    }
}
