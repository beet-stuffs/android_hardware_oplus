package com.oplus.view.material;

import android.view.View;
import java.util.Set;

/**
 * Stock applies these through OPLUS RenderNode extensions that this ROM lacks. Report every
 * effect as not applied.
 */
public class OplusMaterialUtil {

    private OplusMaterialUtil() {
    }

    public static boolean setBaseParams(View view, OplusMaterialBaseParams params) {
        return false;
    }

    public static boolean setCornerParams(View view, OplusMaterialCornerParams params) {
        return false;
    }

    public static boolean setEdgeParams(View view, OplusMaterialEdgeParams params) {
        return false;
    }

    public static boolean setShadowParams(View view, OplusMaterialShadowParams params) {
        return false;
    }

    public static boolean setMetaBallParams(View view, OplusMaterialMetaBallParams params) {
        return false;
    }

    public static boolean setMetaBallChain(View view, Set<View> chain) {
        return false;
    }

    public static boolean setMetaBallChain(Set<View> chain) {
        return false;
    }

    public static boolean setOutlineCausticShadowColor(View view, int color) {
        return false;
    }

    public static boolean setOutlineCausticShadowLayout(View view, int left, int top, int right,
            int bottom) {
        return false;
    }

    public static boolean setOutlineCausticShadowParams(View view, float a, float b, float c,
            float d, float e, float f) {
        return false;
    }

    public static int getOutlineCausticShadowColor(View view) {
        return 0;
    }
}
