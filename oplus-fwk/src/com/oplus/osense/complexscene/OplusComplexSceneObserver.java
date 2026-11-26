package com.oplus.osense.complexscene;

import android.os.Bundle;
import java.util.List;

/**
 * Stock extends IComplexSceneObserver.Stub and is fed by the osense service, which this
 * ROM lacks. The observer never fires.
 */
public class OplusComplexSceneObserver {

    public OplusComplexSceneObserver() {
    }

    public void onChanged(int eventId, List<Bundle> scenes) {
    }
}
