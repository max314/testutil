package com.example.testutil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {

    String command = "busybox ls -1 /system/etc/bootanimation  > /sdcard/1234.txt 2>&1";
    String command1 = "busybox ls -1 /system  > /sdcard/syst.txt 2>&1";
    private static LogHelper Log = new LogHelper(MyActivity.class);
    private String string;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void On0Click(View view) {
        Log.d("on0Click");
        try {
            SysUtils.executeCommand(command, SysUtils.EXECUTE_COMMAND_AS_0);
        } catch (Throwable e) {
            Log.e("0", e);
        }
    }

    public void On1Click(View view) {
        Log.d("on1Click");
        try {
            SysUtils.executeCommand(command, SysUtils.EXECUTE_COMMAND_AS_1);
        } catch (Throwable e) {
            Log.e("1", e);
        }
    }

    public void On2Click(View view) {
        Log.d("on2Click");
        try {
            SysUtils.executeCommand(command, SysUtils.EXECUTE_COMMAND_AS_2);
        } catch (Throwable e) {
            Log.e("2", e);
        }

    }

    public void On3Click(View view) {
        Log.d("on3Click");
        try {
            SysUtils.executeCommand(command, SysUtils.EXECUTE_COMMAND_AS_3);
        } catch (Throwable e) {
            Log.e("3", e);
        }
    }

    public void On4Click(View view) {
        command = command1;
    }
}
