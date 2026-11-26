package com.oplus.view.material;

public class OplusMaterialShadowParams {
    public static final int SHADOW_TYPE_NONE = 0;
    public static final int SHADOW_TYPE_RECTANGLE = 1;
    public static final int SHADOW_TYPE_CIRCLE = 2;
    public static final int SHADOW_TYPE_SQUARE = 3;

    private int mType;
    private float mFadeInAlpha;
    private float mFadeOutAlpha;
    private float mFadeWidthScale;

    public OplusMaterialShadowParams(int type, float fadeInAlpha, float fadeOutAlpha, float fadeWidthScale) {
        mType = type;
        mFadeInAlpha = fadeInAlpha;
        mFadeOutAlpha = fadeOutAlpha;
        mFadeWidthScale = fadeWidthScale;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        mType = type;
    }

    public float getFadeInAlpha() {
        return mFadeInAlpha;
    }

    public void setFadeInAlpha(float fadeInAlpha) {
        mFadeInAlpha = fadeInAlpha;
    }

    public float getFadeOutAlpha() {
        return mFadeOutAlpha;
    }

    public void setFadeOutAlpha(float fadeOutAlpha) {
        mFadeOutAlpha = fadeOutAlpha;
    }

    public float getFadeWidthScale() {
        return mFadeWidthScale;
    }

    public void setFadeWidthScale(float fadeWidthScale) {
        mFadeWidthScale = fadeWidthScale;
    }

    @Override
    public String toString() {
        return "OplusMaterialShadowParams{" + "type=" + mType + ", " + "fadeInAlpha=" + mFadeInAlpha + ", " + "fadeOutAlpha=" + mFadeOutAlpha + ", " + "fadeWidthScale=" + mFadeWidthScale + "}";
    }
}
