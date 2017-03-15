package com.edwinb.edwinbetancur_passthroughfragments;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements F1.IF1Interface, F2.IF2Interface{


    FragmentTransaction ft;
    FragmentManager fm;
    public static F1 f1;
    public static F2 f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null) return;


        fm = getSupportFragmentManager();


        ft = fm.beginTransaction();

        if (findViewById(R.id.forF2) != null)
        {
            f1 = new F1();
            f2 = new F2();
            ft.add(R.id.forF1, f1, "Frag1");
            ft.add(R.id.forF2, f2, "Frag2");
            ft.commit();
        }

        /*f1 = new F1();
        f2 = new F2();
        ft.add(R.id.forF1, f1, "Frag1");
        ft.add(R.id.forF2, f2, "Frag2");
        ft.hide(f2);
        ft.commit();

        ft.addToBackStack("Frag2");*/


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        fm.popBackStack();
    }

    /*@Override
    public void on() {
        super.onBackPressed();

        fm = getSupportFragmentManager();
        fm.beginTransaction()
                .hide(f2)
                .show(f1)
                .commit();

    }*/

    public void send22(String s) {f2.setMyET(s);}

    @Override
    public void iSend22(String s) {

        f2.setMyET(s);
        /*fm = getSupportFragmentManager();
        fm.beginTransaction()
                .hide(f1)
                .show(f2)
                .commit();*/
        Log.i("Tag", "Im here");
    }


    @Override
    public void iSend23(String s) {


        f1.setMyET(s);
        /*fm = getSupportFragmentManager();
        fm.beginTransaction()
                .hide(f2)
                .show(f1)
                .commit();*/
        Log.i("Tag", "Im here");
    }
}