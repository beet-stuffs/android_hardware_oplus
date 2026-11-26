package com.oplus.animation;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.view.View;

/**
 * Stock applies these on the render thread. Apply them directly on the UI thread instead.
 */
public final class OplusAsyncAnimatorUtils {

    private OplusAsyncAnimatorUtils() {
    }

    public static boolean setAlpha(View view, float alpha) {
        view.setAlpha(alpha);
        return true;
    }

    public static boolean setAlpha(RenderNode node, float alpha) {
        return node.setAlpha(alpha);
    }

    public static boolean setScaleX(View view, float scale) {
        view.setScaleX(scale);
        return true;
    }

    public static boolean setScaleY(View view, float scale) {
        view.setScaleY(scale);
        return true;
    }

    public static boolean setTranslationX(View view, float translation) {
        view.setTranslationX(translation);
        return true;
    }

    public static boolean setTranslationY(View view, float translation) {
        view.setTranslationY(translation);
        return true;
    }

    public static boolean setRotation(View view, float value) {
        view.setRotation(value);
        return true;
    }

    public static boolean setRotationX(View view, float value) {
        view.setRotationX(value);
        return true;
    }

    public static boolean setRotationY(View view, float value) {
        view.setRotationY(value);
        return true;
    }

    public static boolean setTranslationZ(View view, float value) {
        view.setTranslationZ(value);
        return true;
    }

    // The rounded outline is only a visual refinement, report it as not handled.
    public static boolean setOutlineRoundRect(View view, Rect rect, float radius, float alpha) {
        return false;
    }
}
