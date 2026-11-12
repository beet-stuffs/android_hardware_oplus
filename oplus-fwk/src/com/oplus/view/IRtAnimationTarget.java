package com.oplus.view;

/** Something a render thread animator drives frame by frame. */
public interface IRtAnimationTarget {
    void animateToFinalPosition(float finalPosition);

    void cancel();

    boolean doFrame(long frameTimeMillis);

    void end();

    boolean isRunning();

    void setAnimationHandler();

    void skipToEnd();

    void start();
}
