package com.example.hoquqi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class FrgHome extends Fragment {

    ScrollView scrollView;
    TextView home1, home2, home3, home4, home5;
    public static boolean fhome0, fhome1, fhome2, fhome3, fhome4, fhome5 = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, null);
        scrollView = rootView.findViewById(R.id.scrollmain);
        home1 = rootView.findViewById(R.id.home1);
        home2 = rootView.findViewById(R.id.home2);
        home3 = rootView.findViewById(R.id.home3);
        home4 = rootView.findViewById(R.id.home4);
        home5 = rootView.findViewById(R.id.home5);

        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (fhome0) {
                    scrollView.scrollTo(0, 0);
                    fhome0 = false;
                } else if (fhome1) {
                    scrollView.scrollTo(0, home1.getTop());
                    fhome1 = false;
                } else if (fhome2) {
                    scrollView.scrollTo(0, home2.getTop());
                    fhome2 = false;
                } else if (fhome3) {
                    scrollView.scrollTo(0, home3.getTop());
                    fhome3 = false;
                } else if (fhome4) {
                    scrollView.scrollTo(0, home4.getTop());
                    fhome4 = false;
                } else if (fhome5) {
                    scrollView.scrollTo(0, home5.getTop());
                    fhome5 = false;
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
                if (fhome0) {
                    scrollView.scrollTo(0, 0);
                    fhome0 = false;
                } else if (fhome1) {
                    scrollView.scrollTo(0, home1.getTop());
                    fhome1 = false;
                } else if (fhome2) {
                    scrollView.scrollTo(0, home2.getTop());
                    fhome2 = false;
                } else if (fhome3) {
                    scrollView.scrollTo(0, home3.getTop());
                    fhome3 = false;
                } else if (fhome4) {
                    scrollView.scrollTo(0, home4.getTop());
                    fhome4 = false;
                } else if (fhome5) {
                    scrollView.scrollTo(0, home5.getTop());
                    fhome5 = false;
                }
            }
        });
    }
}
