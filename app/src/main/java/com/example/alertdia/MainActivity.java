package com.example.alertdia;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("why u gave me 90?");
        adb.setMessage("Exlpain...");
        AlertDialog press = adb.create();
        press.show();
    }

    public void icon(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setMessage("90...");
        adb.setIcon(R.drawable.HATIL);
        AlertDialog icon = adb.create();
        icon.show();
    }

    public void IC(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setMessage("press");
        adb.setIcon(R.drawable.HATIL);
        adb.setNeutralButton("close", new )
        AlertDialog icon = adb.create();
        icon.show();
    }
}
