package com.oplus.view.material;

public class OplusMaterialCornerParams {
    private float mRadius;
    private float mWeight;

    public OplusMaterialCornerParams(float radius, float weight) {
        mRadius = radius;
        mWeight = weight;
    }

    public float getRadius() {
        return mRadius;
    }

    public void setRadius(float radius) {
        mRadius = radius;
    }

    public float getWeight() {
        return mWeight;
    }

    public void setWeight(float weight) {
        mWeight = weight;
    }

    @Override
    public String toString() {
        return "OplusMaterialCornerParams{" + "radius=" + mRadius + ", " + "weight=" + mWeight + "}";
    }
}
