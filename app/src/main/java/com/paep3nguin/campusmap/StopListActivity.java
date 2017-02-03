package com.paep3nguin.campusmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StopListActivity extends AppCompatActivity {

    @BindView(R.id.stopList) ListView mStopList;
    private ArrayList<Stop> mStopArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_list);
        ButterKnife.bind(this);

        mStopArrayList = (ArrayList<Stop>) getIntent().getSerializableExtra("stopList");
        Log.i("StopListActivity", mStopArrayList.toString());
        mStopList.setAdapter(new StopListAdapter(this, mStopArrayList));
    }
}
