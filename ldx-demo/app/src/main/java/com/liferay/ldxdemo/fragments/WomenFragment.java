package com.liferay.ldxdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liferay.ldxdemo.R;

/**
 * @author Javier Gamarra
 */
public class WomenFragment extends NamedFragment {

    public static WomenFragment newInstance() {
        return new WomenFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_women, container, false);
    }

    @Override
    public String getName() {
        return "Women";
    }
}
