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
public class OutdoorsFragment extends Fragment {
    private final int NO_IMAGE = 0;


    public OutdoorsFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_item_list, container, false);

        // we're going to create an array to hold the number touristItems
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();

        // now we'll fill in the array
        touristItems.add(new TouristItem(getString(R.string.name_donner_memorial_state_park), getString(R.string.addr_donner_memorial_state_park), getString(R.string.phone_donner_memorial_state_park), getString(R.string.desc_donner_memorial_state_park), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_donner_lake), getString(R.string.addr_donner_lake), getString(R.string.phone_donner_lake), getString(R.string.desc_donner_lake), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_northstar), getString(R.string.addr_northstar), getString(R.string.phone_northstar), getString(R.string.desc_northstar), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_boreal), getString(R.string.addr_boreal), getString(R.string.phone_boreal), getString(R.string.desc_boreal), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_coyote_moon), getString(R.string.addr_coyote_moon), getString(R.string.phone_coyote_moon), getString(R.string.desc_coyote_moon), NO_IMAGE));
        touristItems.add(new TouristItem(getString(R.string.name_bike_park), getString(R.string.addr_bike_park), getString(R.string.phone_bike_park), getString(R.string.desc_bike_park), NO_IMAGE));

        // create a wordadapter whose data source is the arraylist of type TouristItem
        TouristItemAdapter adapter = new TouristItemAdapter(getActivity(), touristItems, R.color.activity_background_outdoors);

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
