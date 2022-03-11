package com.cs160.prog03;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cs160.prog03.HomePagePackage.View.RecyclerViewHomePage;
import com.cs160.prog03.HomePagePackage.resource.RecentActivity;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Fragment {
    private List<RecentActivity> activities;
    private RecyclerView recyclerView;

    public HomePage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        recyclerView = view.findViewById(R.id.recentActivities);

        activities = new ArrayList<RecentActivity>();
        activities.add(new RecentActivity("Running", "Yesterday"));
        activities.add(new RecentActivity("Running", "Yesterday"));
        activities.add(new RecentActivity("Running", "Yesterday"));


        RecyclerViewHomePage homePage = new RecyclerViewHomePage(activities);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(homePage);
        return view;
    }
}