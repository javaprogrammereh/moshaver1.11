package com.example.hoquqi;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class FrgKhanevade extends Fragment {
    ScrollView scrollView;
    TextView family1, family2, family3, family4, family5, family6, family7;
    public static boolean ffamily0,ffamily1,ffamily2,ffamily3,ffamily4,ffamily5,ffamily6,ffamily7=false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_khanevade, null);
        scrollView = rootView.findViewById(R.id.scrollfamily);
        family1 = rootView.findViewById(R.id.family1);
        family2 = rootView.findViewById(R.id.family2);
        family3 = rootView.findViewById(R.id.family3);
        family4 = rootView.findViewById(R.id.family4);
        family5 = rootView.findViewById(R.id.family5);
        family6 = rootView.findViewById(R.id.family6);
        family7 = rootView.findViewById(R.id.family7);

        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (ffamily0) {
                    scrollView.scrollTo(0, 0);
                    ffamily0 = false;
                } else if (ffamily1) {
                    scrollView.scrollTo(0, family1.getTop());
                    ffamily1 = false;
                } else if (ffamily2) {
                    scrollView.scrollTo(0, family2.getTop());
                    ffamily2 = false;
                } else if (ffamily3) {
                    scrollView.scrollTo(0, family3.getTop());
                    ffamily3 = false;
                } else if (ffamily4) {
                    scrollView.scrollTo(0, family4.getTop());
                    ffamily4 = false;
                } else if (ffamily5) {
                    scrollView.scrollTo(0, family5.getTop());
                    ffamily5 = false;
                } else if (ffamily6) {
                    scrollView.scrollTo(0, family6.getTop());
                    ffamily6 = false;
                } else if (ffamily7) {
                    scrollView.scrollTo(0, family7.getTop());
                    ffamily7 = false;
                }
            }
        });
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (ffamily0) {
                    scrollView.scrollTo(0, 0);
                    ffamily0 = false;
                } else if (ffamily1) {
                    scrollView.scrollTo(0, family1.getTop());
                    ffamily1 = false;
                } else if (ffamily2) {
                    scrollView.scrollTo(0, family2.getTop());
                    ffamily2 = false;
                } else if (ffamily3) {
                    scrollView.scrollTo(0, family3.getTop());
                    ffamily3 = false;
                } else if (ffamily4) {
                    scrollView.scrollTo(0, family4.getTop());
                    ffamily4 = false;
                } else if (ffamily5) {
                    scrollView.scrollTo(0, family5.getTop());
                    ffamily5 = false;
                } else if (ffamily6) {
                    scrollView.scrollTo(0, family6.getTop());
                    ffamily6 = false;
                } else if (ffamily7) {
                    scrollView.scrollTo(0, family7.getTop());
                    ffamily7 = false;
                }
            }
        });
    }
}
