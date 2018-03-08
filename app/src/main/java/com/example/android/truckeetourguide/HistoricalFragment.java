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
public class HistoricalFragment extends Fragment {
    private final int NO_IMAGE = 0;

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_item_list, container, false);

        // we're going to create an array to hold the number touristItems
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();

        // now we'll fill in the array
        touristItems.add(new TouristItem(getString(R.string.name_china_wall), getString(R.string.addr_china_wall), getString(R.string.phone_china_wall), getString(R.string.desc_china_wall), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_jail), getString(R.string.addr_jail), getString(R.string.phone_jail), getString(R.string.desc_jail), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_downtown), getString(R.string.addr_downtown), getString(R.string.phone_downtown), getString(R.string.desc_downtown), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_donner_camp), getString(R.string.addr_donner_camp), getString(R.string.phone_donner_camp), getString(R.string.desc_donner_camp), NO_IMAGE));

        // create a wordadapter whose data source is the arraylist of type TouristItem
        TouristItemAdapter adapter = new TouristItemAdapter(getActivity(), touristItems, R.color.activity_background_historical);

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