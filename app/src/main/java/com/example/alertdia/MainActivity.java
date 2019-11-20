package com.example.alertdia;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * @since 20/11/19
 * @version 0.0.01
 * @author Ido Perez
 */
public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
    }

    /**
     * The Button Openning alert Dialog that shows a messege.
     * @param view
     */
    public void press(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("why u gave me 90?");
        adb.setIcon(R.drawable.hatzil);
        adb.setMessage("Explain...");
        AlertDialog press = adb.create();
        press.show();
    }

    /**
     * The Button Openning alert Dialog that shows a icon with messeage.
     * @param view
     */
    public void icon(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("icon please");
        adb.setMessage("90...");
        adb.setIcon(R.drawable.hatzil);
        AlertDialog icon = adb.create();
        icon.show();
    }

    /**
     * The Button Openning alert Dialog that shows a messege, icon, and button that closing the alert.
     * @param view
     */
    public void IC(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Hellow");
        adb.setMessage("press");
        adb.setIcon(R.drawable.hatzil);
        adb.setNeutralButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
           dialog.cancel();
            }
        });
        AlertDialog IC = adb.create();
        IC.show();
    }

    /**
     * The Button Openning alert Dialog that shows a messege, icon , and button that changing randomaly colors.
     * @param view
     */
    public void Change(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setMessage("change Colors");
        adb.setIcon(R.drawable.hatzil);
        adb.setNeutralButton("close", new DialogInterface.OnClickListener() {
            /**
             * on click closing the alert.
             * @param dialog
             * @param which
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNegativeButton("change Color", new DialogInterface.OnClickListener() {
            /**
             * on click channging the colors randomaly.
             * @param dialog
             * @param which
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                int x = rnd.nextInt(4);
                switch (x){
                    case 0: layout.setBackgroundColor(Color.GREEN); break;
                    case 1: layout.setBackgroundColor(Color.YELLOW); break;
                    case 2: layout.setBackgroundColor(Color.RED); break;
                    case 3: layout.setBackgroundColor(Color.BLACK); break;
                }

            }
        });
        AlertDialog change = adb.create();
        change.show();
    }

    /**
     * The Button Openning alert Dialog that shows a messege, icon , and button that changing randomaly colors, and other button that reseting the color.
     * @param view
     */
    public void superbot(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("U gave me 90");
        adb.setMessage("Super Button");
        adb.setIcon(R.drawable.hatzil);
        adb.setNegativeButton("close", new DialogInterface.OnClickListener() {
            /**
             * on click closing the alert.
             * @param dialog
             * @param which
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNegativeButton("change Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                int x = rnd.nextInt(4);
                switch (x) {
                    case 0:
                        layout.setBackgroundColor(Color.GREEN);
                        break;
                    case 1:
                        layout.setBackgroundColor(Color.YELLOW);
                        break;
                    case 2:
                        layout.setBackgroundColor(Color.RED);
                        break;
                    case 3:
                        layout.setBackgroundColor(Color.BLACK);
                        break;
                }

            }
        });
        adb.setNeutralButton("reset Color", new DialogInterface.OnClickListener() {
            /**
             * on click reseting the color.
             * @param dialog
             * @param which
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                layout.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNegativeButton("close", new DialogInterface.OnClickListener() {
            /**
             * on click closing the alert.
             * @param dialog
             * @param which
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog SuperButton = adb.create();
        SuperButton.show();
    }

    /**
     * creating an menu with cretids option and back option.
     * @param menu
     * @return
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    /**
     * when id = credits moving to the credits activity, id = back staying in the main activ.
     * @param item
     * @return
     */
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.hatil ){
            Intent si = new Intent(this,Credits.class);
            startActivity(si);
        }
        return true;
    }
}
