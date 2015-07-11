package com.elevenfifty.playground1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str = "Hello";
        String str2 = "Class";

        Log.d("TEST", str + ", " + str2);

        int five = 5;
        int six = 6;

        boolean imsmrt = true;

        int eleven = five + six;

        int fifty = 100/2;

        int number = 10;
        logInt(number);
        logBool(imsmrt);
        logInt(++number);
        logInt((int) Math.pow(11,3));

        int one = 0;
        one = true ? 1 : 2;
        logInt(one);

        String password = "changetheworld";
        String verifyPassword = "changeTheWorld";

        if (password.equals(verifyPassword)) {
            Log.d("TEST", "Are you the Keymaster?");
        } else {
            Log.d("TEST", "No Dana, only Zuul!");
        }

        if (password.indexOf("the") > 0) {
            Log.d("TEST", "Where is the 'the'?");
        } else {
            Log.d("TEST", "No :(");
        }


}

    void logInt(int number) {
        Log.d("TEST", String.valueOf(number));
    }

    void logBool(boolean bool) {
        Log.d("TEST", String.valueOf(bool));
    }












    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
