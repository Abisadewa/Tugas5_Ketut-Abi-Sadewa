package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    ListView lv;
    ArrayList al;
    ArrayAdapter aa;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        lv =  (ListView) v.findViewById(R.id.list);
        al = new ArrayList();
        aa = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_activated_1,al);
        lv.setAdapter(aa);
        al.add("Kategori 1");
        al.add("Kategori 2");
        al.add("Kategori 3");
        al.add("Kategori 4");
        al.add("Kategori 5");
        al.add("Kategori 6");
        al.add("Kategori 7");
        al.add("Kategori 8");
        al.add("Kategori 9");
        al.add("Kategori 10");
        al.add("Kategori 11");
        al.add("Kategori 12");
        al.add("Kategori 13");
        al.add("Kategori 14");
        al.add("Kategori 15");
        al.add("Kategori 16");
        al.add("Kategori 17");
        al.add("Kategori 18");

        return v;

    }
}