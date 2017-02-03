package com.paep3nguin.campusmap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class StopListAdapter extends BaseAdapter {

    private ArrayList<Stop> mStopArrayList;
    private LayoutInflater mLayoutInflater;

    public StopListAdapter(Context context, ArrayList<Stop> stopArrayList) {
        mStopArrayList = stopArrayList;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mStopArrayList.size();
    }

    @Override
    public Stop getItem(int position) {
        return mStopArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mStopArrayList.get(position).id;
    }

    private static class ViewHolder {
        TextView stopId;
        TextView stopName;
        TextView stopLocation;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.stop_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.stopId = (TextView) convertView.findViewById(R.id.stopId);
            viewHolder.stopName = (TextView) convertView.findViewById(R.id.stopName);
            viewHolder.stopLocation = (TextView) convertView.findViewById(R.id.stopLocation);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Stop item = getItem(position);

        viewHolder.stopId.setText(Integer.toString(item.id));
        viewHolder.stopName.setText(item.name);
        viewHolder.stopLocation.setText(item.getLatLng().toString());

        return convertView;
    }
}
