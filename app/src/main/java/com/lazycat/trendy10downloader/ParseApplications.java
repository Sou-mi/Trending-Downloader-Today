package com.lazycat.trendy10downloader;

import java.util.ArrayList;

public class ParseApplications {
    private static final String TAG = "PaseApplication";
    private ArrayList<FeedEntry> applications;

    public ParseApplications() {
        this.applications = new ArrayList<>();
    }
    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }
}
