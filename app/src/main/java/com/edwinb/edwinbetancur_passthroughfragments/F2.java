package com.edwinb.edwinbetancur_passthroughfragments;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static com.edwinb.edwinbetancur_passthroughfragments.MainActivity.f1;
import static com.edwinb.edwinbetancur_passthroughfragments.MainActivity.f2;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {
    EditText et2;
    Button b2;
    FragmentManager fm;
    FragmentTransaction ft;
    View v;

    public F2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_f2, container, false);



        setRetainInstance(true);

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

        et2 = (EditText) v.findViewById(R.id.eT2);
        b2 = (Button) v.findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
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
        IF2Interface mA = (IF2Interface) getActivity();
        mA.iSend23(et2.getText().toString());
    }

    /*private void sendNoInterface() {
        //MainActivity mA = (MainActivity) getActivity();
       // mA.send22(et2.getText().toString());
    }*/

    public void setMyET(String s){
        et2.setText(s);
    }

    public interface IF2Interface{
        public void iSend23(String s);
    }

}
