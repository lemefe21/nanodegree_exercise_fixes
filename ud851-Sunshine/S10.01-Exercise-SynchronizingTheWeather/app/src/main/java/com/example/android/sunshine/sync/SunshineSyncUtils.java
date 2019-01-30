package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

public class SunshineSyncUtils {

    /**
     * Helper method to perform a sync immediately using an IntentService for asynchronous
     * execution.
     *
     * @param context The Context used to start the IntentService for the sync.
     */
    public static void startImmediateSync(Context context) {

        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);

    }

}


// OK (9) Create a class called SunshineSyncUtils
    //  OK (10) Create a public static void method called startImmediateSync
    //  OK (11) Within that method, start the SunshineSyncIntentService