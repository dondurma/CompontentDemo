package com.moudlemain.debug;

import android.util.Log;

import com.basemodule.ModuleApplication;

/**
 * @author GaoXP
 * @time 2018/2/27.
 */

public class MainApplication extends ModuleApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.w("TAG", "---MainApplication");

    }
}
