package com.example.mathutils;

import android.content.Context;
import android.widget.Toast;

public class AlarmUtils {

    public static void showToast1(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
