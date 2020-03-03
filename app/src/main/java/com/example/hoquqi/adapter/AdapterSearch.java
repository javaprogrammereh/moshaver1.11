package com.example.hoquqi.adapter;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hoquqi.ActivityRezomeh;
import com.example.hoquqi.FrgHome;
import com.example.hoquqi.FrgKhanevade;
import com.example.hoquqi.FrgMaliati;
import com.example.hoquqi.MainActivity;
import com.example.hoquqi.model.Moshaver;
import com.example.hoquqi.R;

import java.util.ArrayList;

public class AdapterSearch extends ArrayAdapter {
    public int resourceId;
    public Activity activity;
    public ArrayList<Moshaver> data;

    Moshaver model = new Moshaver();
    public static boolean flag_search = false;
    /*create object for xml*/
    TextView txtName;

    public AdapterSearch(Activity activity, int resourceId, ArrayList<Moshaver> object) {
        super(activity, resourceId, object);
        this.resourceId = resourceId;
        this.activity = activity;
        this.data = object;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        view = this.activity.getLayoutInflater().inflate(this.resourceId, null);

        /* Get object from xml file*/
        txtName = view.findViewById(R.id.item_search);

        /*1.set value to model array*/
        model = data.get(position);
        txtName.setText(model.getmName());

        /*2.click item list*/
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*get value name from item */
                String title = data.get(position).getmName();
                /*if searched titr from main*/
                if (title.contains("اصلی") || title.contains("قانون اساسی جمهوری اسلامی ایران") || title.contains("تاریخچه") ||
                        title.contains("قضا در قانون اساسی") || title.contains("قوه مجریه") || title.contains("نمایندگان")) {
                    MainActivity.flag_home = true;
                    if (title.equals("اصلی")) {
                        FrgHome.fhome0 = true;
                    } else if (title.equals("قانون اساسی جمهوری اسلامی ایران")) {
                        FrgHome.fhome1 = true;
                    } else if (title.equals("تاریخچه")) {
                        FrgHome.fhome2 = true;
                    } else if (title.equals("قضا در قانون اساسی")) {
                        FrgHome.fhome3 = true;
                    } else if (title.equals("قوه مجریه")) {
                        FrgHome.fhome4 = true;
                    } else if (title.equals("نمایندگان")) {
                        FrgHome.fhome5 = true;
                    }
                    activity.finish();
                } else if (title.contains("خانواده") || title.contains("صلاحیت های دادگاه خانواده") || title.contains("لزوم تشکیل دادگاه خانواده") ||
                        title.contains("تشریفات رسیدگی در دادگاه خانواده") || title.contains("حضور قاضی زن در دادگاه خانواده")
                        || title.contains("شرایط قضات دادگاه خانواده") || title.contains("مراکز مشاوره خانواده")
                        || title.contains("حمایت های قانونی از افراد بی بضاعت")) {
                    MainActivity.flag_family = true;
                    if (title.equals("خانواده")) {
                        FrgKhanevade.ffamily0 = true;
                    } else if (title.equals("صلاحیت های دادگاه خانواده")) {
                        FrgKhanevade.ffamily1 = true;
                    } else if (title.equals("لزوم تشکیل دادگاه خانواده")) {
                        FrgKhanevade.ffamily2 = true;
                    } else if (title.equals("تشریفات رسیدگی در دادگاه خانواده")) {
                        FrgKhanevade.ffamily3 = true;
                    } else if (title.equals("حضور قاضی زن در دادگاه خانواده")) {
                        FrgKhanevade.ffamily4 = true;
                    } else if (title.equals("شرایط قضات دادگاه خانواده")) {
                        FrgKhanevade.ffamily5 = true;
                    } else if (title.equals("مراکز مشاوره خانواده")) {
                        FrgKhanevade.ffamily6 = true;
                    } else if (title.equals("حمایت های قانونی از افراد بی بضاعت")) {
                        FrgKhanevade.ffamily7 = true;
                    }
                    activity.finish();
                } else if (title.contains("مهاجرت")) {
                    MainActivity.flag_mohajerat = true;
                    activity.finish();
                } else if (title.contains("مالیاتی") || title.contains("جرائم مالیاتی چیست؟") ||
                        title.contains("انواع جرائم مالیاتی")) {
                    MainActivity.flag_maliaty = true;
                    if (title.equals("مالیاتی")) {
                        FrgMaliati.fmali0 = true;
                    } else if (title.equals("جرائم مالیاتی چیست؟")) {
                        FrgMaliati.fmali1 = true;
                    } else if (title.equals("انواع جرائم مالیاتی")) {
                        FrgMaliati.fmali2 = true;
                    }
                    activity.finish();
                }
                /*else searched from model moshaver*/
                else {
                    flag_search = true;
                    Intent intent = new Intent(activity, ActivityRezomeh.class);
                    intent.putExtra("title_search", data.get(position).getmName());
                    activity.startActivity(intent);
                }
            }
        });
        return view;
    }
}
