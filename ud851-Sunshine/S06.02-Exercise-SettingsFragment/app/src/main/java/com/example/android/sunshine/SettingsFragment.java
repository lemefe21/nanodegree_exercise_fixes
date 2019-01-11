package com.example.android.sunshine;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.support.v7.preference.CheckBoxPreference;
import android.support.v7.preference.EditTextPreference;
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceScreen;

/**
 * The SettingsFragment serves as the display for all of the user's settings. In Sunshine, the
 * user will be able to change their preference for units of measurement from metric to imperial,
 * set their preferred weather location, and indicate whether or not they'd like to see
 * notifications.
 *
 * IMPORTANT: set <item name="preferenceTheme">@style/PreferenceThemeOverlay</item> in style.xml
 *
 * Please note: If you are using our dummy weather services, the location returned will always be
 * Mountain View, California.
 */

public class SettingsFragment extends PreferenceFragmentCompat implements OnSharedPreferenceChangeListener {

    @Override
    public void onCreatePreferences(Bundle bundle, String rootKey) {

        //add xml with preferences
        addPreferencesFromResource(R.xml.preference_visualizer);

        SharedPreferences sharedPreferences = getPreferenceScreen().getSharedPreferences();
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        int preferenceCount = preferenceScreen.getPreferenceCount();

        for (int i = 0; i < preferenceCount; i++) {

            Preference preference = preferenceScreen.getPreference(i);

            if(!(preference instanceof CheckBoxPreference)) {
                String valuePreference = sharedPreferences.getString(preference.getKey(), "");
                setSummaryPreference(preference, valuePreference);
            }

        }

    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        Preference preference = findPreference(key);

        if(preference != null) {
            if(!(preference instanceof CheckBoxPreference)) {

                String valuePreference = sharedPreferences.getString(preference.getKey(), "");
                setSummaryPreference(preference, valuePreference);
                
            }
        }


    }

    private void setSummaryPreference(Preference preference, String value) {

        if(preference instanceof ListPreference) {

            ListPreference listPreference = (ListPreference) preference;
            int indexOfValue = listPreference.findIndexOfValue(value);

            if(indexOfValue >= 0) {
                listPreference.setSummary(listPreference.getEntries()[indexOfValue]);
            }


        } else if (preference instanceof EditTextPreference) {

            preference.setSummary(value);

        }

    }

    @Override
    public void onStart() {
        super.onStart();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

}
