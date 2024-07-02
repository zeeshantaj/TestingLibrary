package com.example.tesinglibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mathutils.AlarmUtils;
import com.example.mathutils.LocalDataManager;
import com.example.mathutils.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.showToast4(this,"race");
        LocalDataManager.getInstance().getInt("intKey");
        LocalDataManager.getInstance().putInt("intKey",1);

    }
}