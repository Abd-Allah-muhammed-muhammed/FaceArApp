package net.middledleeast.tamm.helper;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManger {


    private static SharedPreferences sharedPreferences = null;


    public static void setSharedPreferences(Activity activity) {
        if (sharedPreferences == null) {
            sharedPreferences = activity.getSharedPreferences(
                    "Tamm", Context.MODE_PRIVATE);

        }
    }

    public static void clean(Activity activity) {
        setSharedPreferences(activity);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.apply();
        }
    }

    public static void remove(Activity activity, String data_key) {
        setSharedPreferences(activity);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.remove(data_key);
            editor.apply();
        }
    }


    public static void SaveData(Activity activity, String data_Key, String data_Value) {
        setSharedPreferences(activity);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(data_Key, data_Value);
            editor.apply();
        }
    }

    public static void SaveData(Activity activity, String data_Key, long data_Value) {
        setSharedPreferences(activity);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putLong(data_Key, data_Value);
            editor.apply();
        }
    }


    public static void SaveData(Activity activity, String data_Key, int data_Value) {
        setSharedPreferences(activity);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt(data_Key, data_Value);
            editor.apply();
        }
    }

    public static String LoadStringData(Activity activity, String data_Key) {
        setSharedPreferences(activity);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
        } else {

            setSharedPreferences(activity);


        }

        return sharedPreferences.getString(data_Key, null);
    }

    public static long LoadLongData(Activity activity, String data_Key) {
        setSharedPreferences(activity);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
        } else {

            setSharedPreferences(activity);

        }

        return sharedPreferences.getLong(data_Key, 0);
    }


    public static Integer LoadIntegerData(Activity activity, String data_Key) {
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
        } else {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt(data_Key, 0);

            setSharedPreferences(activity);

        }

        return sharedPreferences.getInt(data_Key, 0);
    }


}