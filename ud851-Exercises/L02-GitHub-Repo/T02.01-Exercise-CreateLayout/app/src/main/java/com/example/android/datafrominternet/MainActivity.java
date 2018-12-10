package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // OK (26) Create an EditText variable called mSearchBoxEditText
    // OK (27) Create a TextView variable called mUrlDisplayTextView
    // OK (28) Create a TextView variable called mSearchResultsTextView

    EditText mSearchBoxEditText;
    TextView mUrlDisplayTextView;
    TextView mSearchResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OK (29) Use findViewById to get a reference to mSearchBoxEditText
        // OK (30) Use findViewById to get a reference to mUrlDisplayTextView
        // OK (31) Use findViewById to get a reference to mSearchResultsTextView

        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);
        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);

    }
}
