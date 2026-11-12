package com.oplus.util;

import android.content.Context;
import android.os.SystemProperties;

/**
 * Performance class of the platform (1 low, 2 middle, 3 high) that Oplus apps use to pick
 * animation and blur quality. Stock reads it from the platform tuning; report a high class
 * unless ro.oplus.platform_level says otherwise.
 */
public class OplusPlatformLevelUtils {

    private static final int DEFAULT_LEVEL = 3;

    private static OplusPlatformLevelUtils sInstance;

    public static synchronized OplusPlatformLevelUtils getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new OplusPlatformLevelUtils();
        }
        return sInstance;
    }

    public int getPlatformAnimationLevel() {
        return getLevel();
    }

    public int getPlatformGaussianLevel() {
        return getLevel();
    }

    public int getPlatformLevel(int type) {
        return getLevel();
    }

    private static int getLevel() {
        return SystemProperties.getInt("ro.oplus.platform_level", DEFAULT_LEVEL);
    }
}
