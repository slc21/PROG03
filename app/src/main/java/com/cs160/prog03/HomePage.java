package com.cs160.prog03;

import android.os.Bundle;

import androidx.annotation.NonNull;
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

import com.cs160.prog03.databinding.FragmentHomePageBinding;
import androidx.navigation.fragment.NavHostFragment;

public class HomePage extends Fragment {
    private List<RecentActivity> activities;
    private RecyclerView recyclerView;
    private FragmentHomePageBinding binding;

    public HomePage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        View view = inflater.inflate(R.layout.fragment_home_page, container, false);
        binding = FragmentHomePageBinding.inflate(inflater, container, false);

//        recyclerView = binding.getRoot().findViewById(R.id.recentActivities);
//
//        activities = new ArrayList<RecentActivity>();
//        activities.add(new RecentActivity("Running", "Yesterday"));
//        activities.add(new RecentActivity("Running", "Yesterday"));
//        activities.add(new RecentActivity("Running", "Yesterday"));
//
//
//        RecyclerViewHomePage homePage = new RecyclerViewHomePage(activities);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(homePage);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.startRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HomePage.this)
                        .navigate(R.id.action_homePage_to_exerciseMenu);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}