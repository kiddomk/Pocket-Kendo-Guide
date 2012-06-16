package com.fareastgadget.kendo;


import android.os.Bundle;
import com.phonegap.*;

public class KendoPocketGuideActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.setIntegerProperty("loadUrlTimeoutValue", 40000); 
       super.loadUrl("file:///android_asset/www/index.html");
      
    }
}