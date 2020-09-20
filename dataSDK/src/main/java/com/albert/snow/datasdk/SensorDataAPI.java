package com.albert.snow.datasdk;

import android.app.Application;
import android.util.Log;

import androidx.annotation.Keep;

import java.util.Map;

import static com.albert.snow.datasdk.DataSdkGlobalKt.TAG;

@Keep
public class SensorDataAPI {

    public static final String SDK_VERSION = "1.0.0";

    private static SensorDataAPI INSTANCE;
    private static final Object mLock = new Object();
    private static Map<String, Object> mDeviceInfo;
    private String mDeviceId;

    @Keep
    @SuppressWarnings("UnusedReturnValue")
    public static SensorDataAPI init(Application application) {
        synchronized (mLock) {
            if (null == INSTANCE) {
                INSTANCE = new SensorDataAPI(application);
            }
            return INSTANCE;
        }
    }

    public static SensorDataAPI getInstance() {
        return INSTANCE;
    }

    private SensorDataAPI(Application application) {
        mDeviceId = "testID";

        Log.i(TAG, "create SensorDataAPI");
    }


}
