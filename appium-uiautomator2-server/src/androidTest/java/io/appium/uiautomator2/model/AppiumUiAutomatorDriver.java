package io.appium.uiautomator2.model;


import android.util.Log;

import org.json.JSONObject;

import java.util.Random;
import java.util.UUID;


public class AppiumUiAutomatorDriver {

    private Session session = null;

    public String initializeSession() {
        if (this.session != null) {
//            session.getKnownElements().clear();
            return session.getSessionId();
        }
        Random random = new Random();
        this.session = new Session(new UUID(random.nextLong(), random.nextLong()).toString());
        Log.i("::::::::::session Id:::", session.getSessionId());
        return session.getSessionId();
    }
}
