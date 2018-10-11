
package com.reactlibrary;

import android.app.Application;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNEfilsleepChartModule extends ReactContextBaseJavaModule {

  private static ReactApplicationContext context;
  private final ReactApplicationContext reactContext;

  public RNEfilsleepChartModule(ReactApplicationContext reactContext) {
    super(reactContext);
    context = reactContext;
    this.reactContext = reactContext;
  }

  public static ReactApplicationContext getContext() {
    return context;
  }

  @Override
  public String getName() {
    return "RNEfilsleepChart";
  }

}