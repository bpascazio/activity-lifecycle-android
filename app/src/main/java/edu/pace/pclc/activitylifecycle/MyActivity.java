package edu.pace.pclc.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.util.Log;

public class MyActivity extends Activity {

    static String TAG = "MyActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.d(TAG, "onCreate was called");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy was called");
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart was called");
    }

    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop was called");
    }


    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause was called");
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume was called");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
