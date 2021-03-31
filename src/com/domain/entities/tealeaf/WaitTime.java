package com.domain.entities.tealeaf;

import com.codeborne.selenide.Selenide;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class WaitTime {
    /* For waiting the page loading finished*/
    public static void sleep(Duration duration, String msg) {
        Selenide.sleep(duration.toMillis());
    }

    public static void sleep(long millis, String msg) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
         e.printStackTrace();
        }
    }
}

