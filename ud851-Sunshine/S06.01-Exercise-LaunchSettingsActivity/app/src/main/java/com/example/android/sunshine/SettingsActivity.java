package com.example.android.sunshine;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //configuramos a actionbar, se houver, para visualizar o botão de voltar

        ActionBar supportActionBar = getSupportActionBar();
        if(supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //configuro a ação da actionbar voltar para tela anterior onBackPressed

        int itemId = item.getItemId();
        if(itemId == R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
}
