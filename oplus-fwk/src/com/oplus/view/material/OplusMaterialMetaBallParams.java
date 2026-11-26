package com.oplus.view.material;

public class OplusMaterialMetaBallParams {
    public static final int MODE_X = 0;
    public static final int MODE_Y = 1;

    private int mIndex;
    private int mMode;
    private int mExtension;
    private float mExtensionFactorX;
    private float mExtensionFactorY;

    public OplusMaterialMetaBallParams(int index, int mode) {
        this(index, mode, 0, 0f, 0f);
    }

    public OplusMaterialMetaBallParams(int index, int mode, int extension, float extensionFactorX, float extensionFactorY) {
        mIndex = index;
        mMode = mode;
        mExtension = extension;
        mExtensionFactorX = extensionFactorX;
        mExtensionFactorY = extensionFactorY;
    }

    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int index) {
        mIndex = index;
    }

    public int getMode() {
        return mMode;
    }

    public void setMode(int mode) {
        mMode = mode;
    }

    public int getExtension() {
        return mExtension;
    }

    public void setExtension(int extension) {
        mExtension = extension;
    }

    public float getExtensionFactorX() {
        return mExtensionFactorX;
    }

    public void setExtensionFactorX(float extensionFactorX) {
        mExtensionFactorX = extensionFactorX;
    }

    public float getExtensionFactorY() {
        return mExtensionFactorY;
    }

    public void setExtensionFactorY(float extensionFactorY) {
        mExtensionFactorY = extensionFactorY;
    }

    @Override
    public String toString() {
        return "OplusMaterialMetaBallParams{" + "index=" + mIndex + ", " + "mode=" + mMode + ", " + "extension=" + mExtension + ", " + "extensionFactorX=" + mExtensionFactorX + ", " + "extensionFactorY=" + mExtensionFactorY + "}";
    }
}
