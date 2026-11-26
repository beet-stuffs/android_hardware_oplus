package android.view;

/**
 * Stock makes this the superclass of WindowManager.LayoutParams. Here it is not, so callers'
 * instance-of and OplusTypeCastingHelper checks fail and the OPlus window flags are skipped.
 */
public class OplusBaseLayoutParams extends ViewGroup.LayoutParams {
    public int oplusFlags;
    public int ignoreHomeMenuKey;

    public OplusBaseLayoutParams() {
        super(MATCH_PARENT, MATCH_PARENT);
    }
}
