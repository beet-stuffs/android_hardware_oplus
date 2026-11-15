# hardware/oplus

## Soong options

| Namespace | Variable | Description | Default |
| --------- | -------- | ----------- | ------- |
| OPLUS_LINEAGE_LIVEDISPLAY_HAL | ENABLE_AB | Enable AdaptiveBacklight feature | false |
| OPLUS_LINEAGE_LIVEDISPLAY_HAL | ENABLE_AF | Enable AntiFlicker feature | false |
| OPLUS_LINEAGE_LIVEDISPLAY_HAL | ENABLE_DM | Enable DisplayModes feature | false |
| OPLUS_LINEAGE_LIVEDISPLAY_HAL | ENABLE_PA | Enable PictureAdjustment feature | true |
| OPLUS_LINEAGE_LIVEDISPLAY_HAL | ENABLE_SE | Enable SunlightEnhancement feature | true |
| OPLUS_LINEAGE_TOUCH_HAL | ENABLE_GM | Enable GloveMode feature | false |
| OPLUS_LINEAGE_TOUCH_HAL | ENABLE_HTPR | Enable HighTouchPollingRate feature | true |
| OPLUS_LINEAGE_TOUCH_HAL | ENABLE_TG | Enable TouchscreenGesture feature | true |
| OPLUS_LINEAGE_TOUCH_HAL | GESTURE_ENABLE_INDEP_NODES | Space-separated gesture mask node paths, used when USE_OPLUSTOUCH is false | /proc/touchpanel/double_tap_enable_indep |
| OPLUS_LINEAGE_TOUCH_HAL | HTPR_ENABLE_NODE | HighTouchPollingRate enable node | GAME_SWITCH_ENABLE_NODE |
| OPLUS_LINEAGE_TOUCH_HAL | HTPR_ENABLE_VALUE | HighTouchPollingRate enable value | 1 |
| OPLUS_LINEAGE_TOUCH_HAL | INCLUDE_DIR | Device specific include dir path | |
| OPLUS_LINEAGE_TOUCH_HAL | USE_OPLUSTOUCH | Use and interface with stock OplusTouch | false |
| OPLUS_LINEAGE_VIBRATOR_HAL | INCLUDE_DIR | Device specific include dir path | |
| OPLUS_LINEAGE_VIBRATOR_HAL | MAGNITUDE_FLOOR | Map primitive scales and amplitudes onto the LIGHT..STRONG magnitudes instead of 0..STRONG, and keep the strength of an effect from leaking into later `on()` calls | false |
| OPLUS_LINEAGE_VIBRATOR_HAL | OVERRIDE_EFFECTS | Enable device-provided `VibratorEffectsOverride.h` remaps for Richtap effects | false |
| OPLUS_LINEAGE_VIBRATOR_HAL | SUPPORT_TEXTURE_TICK | Report TEXTURE_TICK (id 21 of the effect stream table) as a supported effect, needs USE_EFFECT_STREAM and a device effect table | false |
| OPLUS_LINEAGE_VIBRATOR_HAL | USE_EFFECT_STREAM | Enable effect stream feature | false |
| OPLUS_LINEAGE_VIBRATOR_HAL | USES_OPLUS_AWINIC | Enable Oplus Awinic sysfs-backed vibrator path | false |
| OPLUS_SENSORS_FUSIONLIGHT | BACKEND_SUBHAL_LIB_NAME | FusionLight Sensors SubHAL backend library name | |
