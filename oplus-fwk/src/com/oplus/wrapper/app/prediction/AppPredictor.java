package com.oplus.wrapper.app.prediction;

/**
 * Stock wraps android.app.prediction.AppPredictor for the OPlus share sheet, whose
 * predictions come from the OPlus shortcuts library this ROM lacks. Apps only need the
 * type to exist: the gallery creates it inside runCatching and casts the (null) result.
 */
public class AppPredictor {
}
