package com.uberspot.a2048;

import com.uberspot.a2048.R;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private WebView mWebView;
	private long mLastPress;
	private static final long mBackPressThreshold = 4000;
	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mWebView = (WebView) findViewById(R.id.mainWebView);
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setDomStorageEnabled(true);
		
		if (savedInstanceState != null) {
			mWebView.restoreState(savedInstanceState);
	    } else {
	    	mWebView.loadUrl("file:///android_asset/2048/index.html");
	    }
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		mWebView.saveState(outState);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	@Override
	public void onBackPressed() {
	    long currentTime = System.currentTimeMillis();
	    Toast pressBackToast = Toast.makeText(getApplicationContext(), 
        					R.string.press_back_again_to_exit, Toast.LENGTH_SHORT);
	    if (Math.abs(currentTime - mLastPress) > mBackPressThreshold) {
	        pressBackToast.show();
	        mLastPress = currentTime;
	    } else {
	    	pressBackToast.cancel();
	        super.onBackPressed();
	    }
	}
}
