package com.cerenerdem.instagramcloneparseexample;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6p8d8qJut7L11CoHccofQ2jbjC0WYiYaLGs2rWyo")
                .clientKey("QwFMNOR6RNl5UxVGwIGTrikPjNMuSL3U3a2A2Gog")
                .server("https://parseapi.back4app.com/")
                .build());

    }
}
