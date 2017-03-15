package com.edwinb.edwinbetancur_passthroughfragments; /**
 * Created by EDWINB on 3/15/2017.
 */


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static com.edwinb.edwinbetancur_passthroughfragments.MainActivity.f1;
import static com.edwinb.edwinbetancur_passthroughfragments.MainActivity.f2;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
    EditText et1;
    Button b1;
    FragmentManager fm;
    FragmentTransaction ft;
    View v;



    public F1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_f1, container, false);


        setRetainInstance(true);

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

        et1 = (EditText) v.findViewById(R.id.eT1);
        b1 = (Button) v.findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                sendMyText();
            }
        });


    }

    private void sendMyText() {
        sendWithInterface();
    }


    private void sendWithInterface() {
        IF1Interface mA = (IF1Interface) getActivity();
        mA.iSend22(et1.getText().toString());
    }

    /*private void sendNoInterface() {
        MainActivity mA = (MainActivity) getActivity();
        mA.send22(et1.getText().toString());
    }*/

    public void setMyET(String s){
        et1.setText(s);
    }

    public interface IF1Interface{
        public void iSend22(String s);
    }


}