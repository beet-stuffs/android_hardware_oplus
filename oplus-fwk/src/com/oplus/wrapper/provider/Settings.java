package com.oplus.wrapper.provider;

import android.content.ContentResolver;

public class Settings {

    public static class System {

        public static int getIntForUser(ContentResolver cr, String name, int def,
                int userHandle) {
            return android.provider.Settings.System.getIntForUser(cr, name, def, userHandle);
        }
    }

    public static class Secure {

        public static int getIntForUser(ContentResolver cr, String name, int userHandle)
                throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Secure.getIntForUser(cr, name, userHandle);
        }
    }
}
