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
package com.example.android.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // OK (1) Create a private static final int called NUM_LIST_ITEMS and set it equal to 100
    // OK (2) Create a GreenAdapter variable called mAdapter
    // OK (3) Create a RecyclerView variable called mNumbersList

    private static final int NUM_LIST_ITEMS = 100;
    private GreenAdapter mAdapter;
    private RecyclerView mNumbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OK (4) Use findViewById to store a reference to the RecyclerView in mNumbersList
        mNumbersList = (RecyclerView) findViewById(R.id.rv_numbers);

        // OK (5) Create a LinearLayoutManager variable called layoutManager
        /*
         * A LinearLayoutManager is responsible for measuring and positioning item views within a
         * RecyclerView into a linear list. This means that it can produce either a horizontal or
         * vertical list depending on which parameter you pass in to the LinearLayoutManager
         * constructor. By default, if you don't specify an orientation, you get a vertical list.
         * In our case, we want a vertical list, so we don't need to pass in an orientation flag to
         * the LinearLayoutManager constructor.
         *
         * There are other LayoutManagers available to display your data in uniform grids,
         * staggered grids, and more! See the developer documentation for more details.
         */
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // OK (6) Use setLayoutManager on mNumbersList with the LinearLayoutManager we created above
        mNumbersList.setLayoutManager(layoutManager);

        // OK (7) Use setHasFixedSize(true) to designate that the contents of the RecyclerView won't change an item's size
        /*
         * Use this setting to improve performance if you know that changes in content do not
         * change the child layout size in the RecyclerView
         */
        mNumbersList.setHasFixedSize(true);

        // OK (8) Store a new GreenAdapter in mAdapter and pass it NUM_LIST_ITEMS
        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);

        // OK (9) Set the GreenAdapter you created on mNumbersList
        mNumbersList.setAdapter(mAdapter);

    }
}
