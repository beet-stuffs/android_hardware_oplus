package com.oplus.flexiblewindow;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.res.Configuration;
import android.os.Bundle;

/**
 * Stock talks to the OPlus flexible (floating/embedded) window service in system_server,
 * which this ROM lacks. Nothing runs in a flexible window here.
 */
public class FlexibleWindowManager {

    private static final FlexibleWindowManager sInstance = new FlexibleWindowManager();

    private FlexibleWindowManager() {
    }

    public static FlexibleWindowManager getInstance() {
        return sInstance;
    }

    public int getFlexibleWindowState(Activity activity) {
        return 0;
    }

    public boolean isFlexibleActivity(Configuration config) {
        return false;
    }

    public boolean isFlexibleActivitySuitable(Configuration config) {
        return false;
    }

    public Bundle setExtraBundle(ActivityOptions options, Bundle extra) {
        return options != null ? options.toBundle() : extra;
    }

    public void removeEmbeddedContainerTask(int taskId, int userId) {
    }
}
