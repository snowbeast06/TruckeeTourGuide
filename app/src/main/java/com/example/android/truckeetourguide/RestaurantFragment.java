package com.example.android.truckeetourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {
    private final int NO_IMAGE = 0;


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tourist_item_list, container, false);

        // we're going to create an array to hold the number touristItems
        final ArrayList<TouristItem> touristItems = new ArrayList<TouristItem>();

        // now we'll fill in the array
        touristItems.add(new TouristItem(getString(R.string.name_cottonwoods), getString(R.string.addr_cottonwoods), getString(R.string.phone_cottonwoods), getString(R.string.desc_cottonwoods), R.drawable.cottonwood));
        touristItems.add(new TouristItem(getString(R.string.name_squeeze_inn), getString(R.string.addr_squeeze_inn), getString(R.string.phone_squeeze_inn), getString(R.string.desc_squeeze_inn), R.drawable.squeeze_inn));
        touristItems.add(new TouristItem(getString(R.string.name_moodys), getString(R.string.addr_moodys), getString(R.string.phone_moodys), getString(R.string.desc_moodys), R.drawable.moodys_bistro));
        touristItems.add(new TouristItem(getString(R.string.name_smokeys), getString(R.string.addr_smokeys), getString(R.string.phone_smokeys), getString(R.string.desc_smokeys), R.drawable.smokeys));
        touristItems.add(new TouristItem(getString(R.string.name_burgerme), getString(R.string.addr_burgerme), getString(R.string.phone_burgerme), getString(R.string.desc_burgerme), R.drawable.burgerme));


        // create a wordadapter whose data source is the arraylist of type TouristItem
        TouristItemAdapter adapter = new TouristItemAdapter(getActivity(), touristItems, R.color.activity_background_restaurants);

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
