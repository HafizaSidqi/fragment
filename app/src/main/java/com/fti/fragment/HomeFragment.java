package com.fti.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView rvDrama;
    private ArrayList<DramaModel> dramaList = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvDrama = view.findViewById(R.id.rcv);
        rvDrama.setHasFixedSize(true);
        dramaList.addAll(DramaData.getListData());


        //rvDrama.setLayoutManager(new LinearLayoutManager(getActivity()));
        //DramaAdapter dramaAdapter = new DramaAdapter(
        //        DramaData.getListData(), getActivity());
        //rvDrama.setAdapter(dramaAdapter);
        showRecyclerList();
    }


    private void showRecyclerList() {
        rvDrama.setLayoutManager(new LinearLayoutManager(getActivity()));
        DramaAdapter dramaAdapter = new DramaAdapter(DramaData.getListData(), getActivity());
        dramaAdapter.setDramaModels(dramaList);
        rvDrama.setAdapter(dramaAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}