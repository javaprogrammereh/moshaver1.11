package com.example.hoquqi;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class FrgMaliati extends Fragment {
    ScrollView scrollView;
    TextView mali1,mali2;
     public static boolean fmali0,fmali1,fmali2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_maliati, null);
        scrollView = rootView.findViewById(R.id.scrollmali);
        mali1 = rootView.findViewById(R.id.mali1);
        mali2 = rootView.findViewById(R.id.mali2);

        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (fmali0) {
                    scrollView.scrollTo(0, 0);
                    fmali0 = false;
                } else if (fmali1) {
                    scrollView.scrollTo(0, mali1.getTop());
                    fmali1 = false;
                } else if (fmali2) {
                    scrollView.scrollTo(0, mali2.getTop());
                    fmali2 = false;
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
                if (fmali0) {
                    scrollView.scrollTo(0, 0);
                    fmali0 = false;
                } else if (fmali1) {
                    scrollView.scrollTo(0, mali1.getTop());
                    fmali1 = false;
                } else if (fmali2) {
                    scrollView.scrollTo(0, mali2.getTop());
                    fmali2 = false;
                }
            }
        });
    }
}
