package com.example.user_01.ex_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment04 extends Fragment {
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3", "LIST4", "LIST5", "LIST6", "LIST7",
            "LIST8", "LIST9", "LIST10", "LIST11", "LIST12", "LIST13", "LIST14", "LIST15", "LIST16", "LIST17",
            "LIST18", "LIST19", "LIST20", "LIST21", "LIST22", "LIST23", "LIST24", "LIST25", "LIST26", "LIST27", "LIST28", "LIST29", "LIST30", "LIST31"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        //return inflater.inflate(R.layout.fragment_layout04, container, false);
        View view = inflater.inflate(R.layout.fragment_layout04, null); //수정부분분 -----> 끝에 return view; 반드시 해줘야 함.

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, LIST_MENU); //스트링타입이라 adapter중에서도 array타입을 사용

        ListView listview = (ListView) view.findViewById(R.id.listview1);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                // get TextView's Text.
                String strText = (String) parent.getItemAtPosition(position) ;

                // TODO : use strText
            }
        }) ;
        return view; //리턴은 꼭 해줘야 에러 안남
    }

}
/*
public class Fragment04 extends Fragment {
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        //return inflater.inflate(R.layout.fragment_layout04,container,false);
        View view = inflater.inflate(R.layout.fragment_layout04, null); //수정부분분

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, LIST_MENU);

        ListView listview = (ListView) view.findViewById(R.id.listview1);
        listview.setAdapter(adapter);


    }
}*/
