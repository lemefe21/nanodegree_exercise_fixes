package com.example.android.background.sync;

// OK (1) Create a class called ReminderTasks

// OK (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT

// OK (6) Create a public static void method called executeTask
// OK (7) Add a Context called context and String parameter called action to the parameter list

// OK (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount

// OK (3) Create a private static void method called incrementWaterCount
// ok (4) Add a Context called context to the argument list
// ok (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

public class ReminderTasks {

    public static final String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";

    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
    }

    public static void executeTask(Context context, String action) {

        if(action.equals(ACTION_INCREMENT_WATER_COUNT)) {
            incrementWaterCount(context);
        }

    }

}