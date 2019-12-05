package com.example.flutter_app;

import android.os.Bundle;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.view.FlutterMain;

/**
 * @author lizhangqu
 * @version V1.0
 * @since 2019-12-05 11:12
 */
public class FlutterEntryActivity extends FlutterActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        FlutterMain.startInitialization(getApplicationContext());
        super.onCreate(savedInstanceState);
        GeneratedPluginRegistrant.registerWith(this);
    }
}
