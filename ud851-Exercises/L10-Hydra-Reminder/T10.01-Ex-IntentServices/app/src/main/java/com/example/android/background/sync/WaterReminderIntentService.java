/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.background.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

// OK (9) Create WaterReminderIntentService and extend it from IntentService

//  OK (10) Create a default constructor that calls super with the name of this class

//  OK (11) Override onHandleIntent
//      OK (12) Get the action from the Intent that started this Service
//      OK (13) Call ReminderTasks.executeTaskForTag and pass in the action to be performed

public class WaterReminderIntentService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param //name Used to name the worker thread, important only for debugging.
     */
    public WaterReminderIntentService() {
        super("WaterReminderIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        //run in background similar LoadInBackground on AsyncTaskLoader

        String intentAction = intent.getAction();

        ReminderTasks.executeTask(this, intentAction);

    }

}