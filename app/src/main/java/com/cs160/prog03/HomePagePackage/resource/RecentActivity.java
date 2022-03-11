package com.cs160.prog03.HomePagePackage.resource;

public class RecentActivity {
    private String activity;
    private String time;

    public RecentActivity(String activity, String time) {
        this.activity = activity;
        this.time = time;
    }

    public String getActivity() {
        return activity;
    }

    public String getTime() {
        return time;
    }
}
