/**
 * React Native Secure Key Store
 * Store keys securely in Android Keystore
 * Ref: cordova-plugin-secure-key-store
 */

package com.reactlibrary.securekeystore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class RNSecureKeyStorePackage implements ReactPackage {
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    this.RNSecureKeyStoreModule = new RNSecureKeyStoreModule(reactContext));
    modules.add(this.RNSecureKeyStoreModule);
    return modules;

  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
