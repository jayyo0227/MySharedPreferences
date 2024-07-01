package jayyo.mysharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceHelper {
    private static final SharedPreferenceHelper INSTANCE = new SharedPreferenceHelper();
    private SharedPreferences mSP;
    private SharedPreferences.Editor mSPED;

    private SharedPreferenceHelper() {
    }

    public static SharedPreferenceHelper get() {
        return INSTANCE;
    }

    public void setAppContext(Context context) {
        setSP(context.getSharedPreferences("MainSP", Context.MODE_PRIVATE));
    }

    public void setSP(SharedPreferences sharedPreferences) {
        mSP = sharedPreferences;
        mSPED = sharedPreferences.edit();
    }

    public String getString(String key, String defaultValue) {
        return mSP.getString(key, defaultValue);
    }

    public void putString(String key, String value) {
        mSPED.putString(key, value);
        mSPED.apply();
//        mSPED.commit();
    }
}
