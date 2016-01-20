package com.bb.a2048;

/**
 * Created by tingshi on 12/11/15.
 */

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTests extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTests() {
        super(MainActivity.class);
    }

    public void testActivityExists() {
        MainActivity activity = getActivity();
        assertNotNull(activity);
    }
}