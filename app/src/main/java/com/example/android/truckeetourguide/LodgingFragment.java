package com.example.android.truckeetourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LodgingFragment extends Fragment {
    private final int NO_IMAGE = 0;


    public LodgingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_item_list, container, false);

        // we're going to create an array to hold the number touristItems
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();

        // now we'll fill in the array
        touristItems.add(new TouristItem(getString(R.string.name_truckee_donner_lodge), getString(R.string.addr_truckee_donner_lodge), getString(R.string.phone_truckee_donner_lodge), getString(R.string.desc_truckee_donner_lodge), R.drawable.truckee_donner_lodge ));
        touristItems.add(new TouristItem(getString(R.string.name_ritzcarlton), getString(R.string.addr_ritzcarlton), getString(R.string.phone_ritzcarlton), getString(R.string.desc_ritzcarlton), R.drawable.ritz));
        touristItems.add(new TouristItem(getString(R.string.name_cedar_house), getString(R.string.addr_cedar_house), getString(R.string.phone_cedar_house), getString(R.string.desc_cedar_house), R.drawable.cedar_sport));
        touristItems.add(new TouristItem(getString(R.string.name_truckee_hotel), getString(R.string.addr_truckee_hotel), getString(R.string.phone_truckee_hotel), getString(R.string.desc_truckee_hotel), R.drawable.truckeehotel));
        touristItems.add(new TouristItem(getString(R.string.name_redlight_hostel), getString(R.string.addr_redlight_hostel), getString(R.string.phone_redlight_hostel), getString(R.string.desc_redlight_hostel), R.drawable.redlight));
        touristItems.add(new TouristItem(getString(R.string.name_best_western), getString(R.string.addr_best_western), getString(R.string.phone_best_western), getString(R.string.desc_best_western), R.drawable.bestwestern));

        // create a wordadapter whose data source is the arraylist of type TouristItem
        TouristItemAdapter adapter = new TouristItemAdapter(getActivity(), touristItems, R.color.activity_background_lodging);

        // get a reference to the listview and add the adapter to the listview
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        //set an onclicklistener...
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // we havent implemented anything in the on-click listener at this point
                // but perhaps a future version could kick off a google maps intent...
                }
        });
        return rootView;
    }
}
