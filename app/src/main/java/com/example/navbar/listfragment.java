package com.example.navbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class listfragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<partmodel> listitem = new ArrayList<>();
    private Object partadapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rv_panggil);
        recyclerView.setHasFixedSize(true);
        listitem.addAll(partdata.getListdata());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        partadapter Partadapter = new partadapter(partdata.getListdata(),getActivity());

        recyclerView.setAdapter(Partadapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listfragment, container, false);
    }
}