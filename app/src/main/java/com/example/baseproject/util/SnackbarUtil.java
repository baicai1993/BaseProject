package com.example.baseproject.util;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

/**
 * Created by chenxz on 2017/12/3.
 */

public class SnackbarUtil {

    public static void show(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }

    public static void showShort(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }

}
