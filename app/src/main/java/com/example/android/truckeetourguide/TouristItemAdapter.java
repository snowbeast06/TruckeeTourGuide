package com.example.android.truckeetourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by genetrinks on 2/7/18.
 */

public class TouristItemAdapter extends ArrayAdapter<TouristItem> {

    private int mColorResourceID;

    public TouristItemAdapter(Activity context, ArrayList<TouristItem> touristItems, int color) {
        super(context, 0, touristItems);
        mColorResourceID = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tourist_item, parent, false);
        }

        // Get the {@link TouristItem} object located at this position in the list
        TouristItem currentTouristItem = getItem(position);

        // Find the Imageview in the tourist_itemtem.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Get the image resource ID from the current TouristItem object and
        // set this image on the imageview
        imageView.setImageResource(currentTouristItem.getDrawableImageResourceID());

        // if there is no image assigned set the visibility of the imageview to GONE
        if (!currentTouristItem.hasImage()) {
            imageView.setVisibility(View.GONE);
        } else {
            imageView.setVisibility(View.VISIBLE);
        }

        // Find the TextView in the tourist_item.xml xml layout with the ID tourist_item_name
        TextView itemName = (TextView) listItemView.findViewById(R.id.tourist_item_name);

        // Get the name from the current TouristItem object and
        // set this text on the name TextView
        itemName.setText(currentTouristItem.getTouristItemName());

        // Find the TextView in the tourist_item.xml layout with the ID tourist_item_address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.tourist_item_address);

        // Get the english Translation from the current TouristItem object and
        // set this text on the name TextView
        addressTextView.setText(currentTouristItem.getTouristItemAddress());

        // Find the TextView in the tourist_item.xml layout with the ID tourist_item_phone
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.tourist_item_phone);

        // Get the english Translation from the current TouristItem object and
        // set this text on the name TextView
        phoneTextView.setText(currentTouristItem.getTouristItemPhoneNum());

        // Find the TextView in the tourist_item.xml layout with the ID tourist_item_descr
        TextView descrTextView = (TextView) listItemView.findViewById(R.id.tourist_item_descr);

        // Get the english Translation from the current TouristItem object and
        // set this text on the name TextView
        descrTextView.setText(currentTouristItem.getTouristItemDescr());

        // set the proper background color for this linear layout with the text
        RelativeLayout parentLayout = (RelativeLayout) listItemView.findViewById(R.id.toplevellayout);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        parentLayout.setBackgroundColor(color);

        //return the view
        return listItemView;

    }
}
