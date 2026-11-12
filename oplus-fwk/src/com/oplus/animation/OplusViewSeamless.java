package com.oplus.animation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/** Seamless view transitions need the OxygenOS window manager, report them as unavailable. */
public final class OplusViewSeamless {

    private OplusViewSeamless() {
    }

    public static boolean setSeamlessView(View view, Context context, Bundle extras,
            AnimationCallback callback) {
        return false;
    }

    public abstract static class AnimationCallback {
    }
}
