package com.example.custom_toast;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {

    public static void show(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

}
