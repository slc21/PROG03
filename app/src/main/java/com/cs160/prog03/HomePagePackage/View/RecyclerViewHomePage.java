package com.cs160.prog03.HomePagePackage.View;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.cs160.prog03.HomePagePackage.resource.RecentActivity;
import com.cs160.prog03.R;

import java.util.List;

public class RecyclerViewHomePage extends RecyclerView.Adapter<RecyclerViewHomePage.HomePageViewHolder> {
    private List<RecentActivity> activityList;

    public RecyclerViewHomePage(List<RecentActivity> activityList) {
        this.activityList = activityList;
    }

    public class HomePageViewHolder extends RecyclerView.ViewHolder {
        private TextView activity;
        private TextView date;
        public HomePageViewHolder(final View view) {
            super(view);
            activity = view.findViewById(R.id.runningEntry);
            date = view.findViewById(R.id.dateEntry);

        }
    }

    @NonNull
    @Override
    public RecyclerViewHomePage.HomePageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new HomePageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePageViewHolder holder, int position) {
        String activity = activityList.get(position).getActivity();
        String time = activityList.get(position).getTime();

        holder.activity.setText(activity);
        holder.date.setText(time);
    }

    @Override
    public int getItemCount() {
        return activityList.size();
    }

}
