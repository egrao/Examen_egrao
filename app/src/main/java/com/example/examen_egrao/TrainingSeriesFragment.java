package com.example.examen_egrao;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TrainingSeriesFragment extends ListFragment {
    private ListView listview;
    private ArrayList<String> entrenaments;


    public TrainingSeriesFragment() {
        // Required empty public constructor
    }


//    public static TrainingSeriesFragment newInstance(String param1, String param2) {

//        TrainingSeriesFragment fragment = new TrainingSeriesFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    public static interface Listener {
        void itemClicked(long id);
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        listview = (ListView) getView().findViewById(R.id.listview);

        entrenaments = new ArrayList<String>();
        entrenaments.add("Extremitats a Tope");
        entrenaments.add("Agonia Màxima");
        entrenaments.add("Entrenament especial");
        entrenaments.add("Força i longitud");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, entrenaments);
        listview.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_training_series, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {


//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction ft = manager.beginTransaction();
//        ft.replace(R.id.pager, new Home());
//        ft.commit();

    }
}