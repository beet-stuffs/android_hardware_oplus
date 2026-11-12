package com.oplus.view;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.Choreographer;
import android.view.View;

/**
 * Stock runs these animations on the render thread. Without that, drive the target from
 * Choreographer frames on the UI thread, which gives the same result.
 */
public final class OplusRenderNodeAnimator {

    private OplusRenderNodeAnimator() {
    }

    public static Animator createRtAnimator(IRtAnimationTarget target, View view) {
        return new RtAnimator(target);
    }

    public static Animator createRenderValueAnimator(Animator animator, View view) {
        return animator;
    }

    public static void animateToFinalPosition(Animator animator, float finalPosition) {
        if (animator instanceof RtAnimator) {
            RtAnimator rt = (RtAnimator) animator;
            rt.mTarget.animateToFinalPosition(finalPosition);
            rt.start();
        }
    }

    public static long getFrameNumber(Animator animator) {
        return 0;
    }

    static final class RtAnimator extends Animator implements Choreographer.FrameCallback {
        final IRtAnimationTarget mTarget;
        boolean mRunning;

        RtAnimator(IRtAnimationTarget target) {
            mTarget = target;
        }

        @Override
        public void start() {
            if (mRunning) {
                return;
            }
            mRunning = true;
            notifyListeners(true);
            Choreographer.getInstance().postFrameCallback(this);
        }

        @Override
        public void doFrame(long frameTimeNanos) {
            if (!mRunning) {
                return;
            }
            if (mTarget.doFrame(frameTimeNanos / 1000000L)) {
                finish();
            } else {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }

        @Override
        public void cancel() {
            if (mRunning) {
                mTarget.cancel();
                finish();
            }
        }

        @Override
        public void end() {
            if (mRunning) {
                mTarget.end();
                finish();
            }
        }

        private void finish() {
            mRunning = false;
            notifyListeners(false);
        }

        private void notifyListeners(boolean start) {
            java.util.ArrayList<AnimatorListener> listeners = getListeners();
            if (listeners == null) {
                return;
            }
            for (int i = 0; i < listeners.size(); i++) {
                if (start) {
                    listeners.get(i).onAnimationStart(this);
                } else {
                    listeners.get(i).onAnimationEnd(this);
                }
            }
        }

        @Override
        public boolean isRunning() {
            return mRunning;
        }

        @Override
        public long getStartDelay() {
            return 0;
        }

        @Override
        public void setStartDelay(long startDelay) {
        }

        @Override
        public Animator setDuration(long duration) {
            return this;
        }

        @Override
        public long getDuration() {
            return 0;
        }

        @Override
        public void setInterpolator(TimeInterpolator value) {
        }
    }
}
