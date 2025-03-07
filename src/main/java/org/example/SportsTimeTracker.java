package org.example;

import java.util.HashMap;

public class SportsTimeTracker {

    HashMap<String, Integer> activities = new HashMap<>();
    public int totalTimeSpent() {
        Integer sum = 0;
        for (String activity: activities.keySet()) {
            
            sum += activities.get(activity);
        }
        return sum;
    }

    public void viewLoggedActivities() {
        for (String activity : activities.keySet()) {
            System.out.println(activity + ": " + activities.get(activity));
        }
    }
    public void logSportsActivity(String activity, int duration) {
        activities.put(activity, duration);
    }
    public static void main(String[] args) {
        SportsTimeTracker tracker = new SportsTimeTracker();
        tracker.logSportsActivity("Swimming", 120);
        tracker.logSportsActivity("Running", 60);
        tracker.logSportsActivity("Cycling", 90);
        tracker.viewLoggedActivities();
        System.out.println("Total time is: " + tracker.totalTimeSpent());

    }
}
