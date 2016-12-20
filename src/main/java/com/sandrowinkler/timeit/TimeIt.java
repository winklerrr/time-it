package com.sandrowinkler.timeit;

import android.os.SystemClock;
import android.util.Log;

/**
 * @author Sandro Winkler
 * Created by Sandro Winkler on 20/12/2016.
 */
public class TimeIt {

    private long startTime;
    private final String logIdentifier;

    public TimeIt(final String logIdentifier) {
        this.logIdentifier = logIdentifier;
        startTime = getCurrentTime();
    }

    public void restart() {
        startTime = getCurrentTime();
    }

    public long getElapsedTime() {
        return getCurrentTime() - startTime;
    }

    public void logElapsedTime() {
        Log.i(this.getClass().getSimpleName(), logIdentifier + " :: " + getElapsedTime());
    }

    private long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

}
