package com.timer.student.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.timer.student.myapplication.R;
import com.timer.student.myapplication.adapters.SingerAdapter;
import com.timer.student.myapplication.models.SingerModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 2017-03-15.
 */

public class SingerListFrag extends Fragment {

    private List<SingerModel> mData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.singlist_item,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView listView = (ListView) view.findViewById(R.id.singlist_view);

        mData = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            mData.add(new SingerModel("가수 " + i));
        }

        SingerAdapter adapter = new SingerAdapter(mData);
        listView.setAdapter(adapter);
    }
}
