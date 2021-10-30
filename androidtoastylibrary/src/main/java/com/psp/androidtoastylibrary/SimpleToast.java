package com.psp.androidtoastylibrary;

import android.content.Context;
import android.widget.Toast;

public class SimpleToast {


    public static void makeShortToast(Context context,String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void makeLongToast(Context context,String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
