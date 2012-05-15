package org.infil00p.CordovaView;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.IPlugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CordovaViewTestActivity extends Activity implements CordovaInterface{
    CordovaWebView phoneGap;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        phoneGap = (CordovaWebView) findViewById(R.id.phoneGapView);
        
        phoneGap.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public void bindBackButton(boolean arg0) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void cancelLoadUrl() {
      // TODO Auto-generated method stub
      
    }

    @Override
    public Activity getActivity() {
      // TODO Auto-generated method stub
      return this;
    }

    @Override
    public boolean isBackButtonBound() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public Object onMessage(String arg0, Object arg1) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public void setActivityResultCallback(IPlugin arg0) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void startActivityForResult(IPlugin arg0, Intent arg1, int arg2) {
      // TODO Auto-generated method stub
      
    }
}