package com.mybus.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mybus.R;
import com.mybus.model.BusLine;
import com.mybus.view.BusLineItemViewHolder;

import java.util.List;

/**
 * Created by Julian Gonzalez <jgonzalez@devspark.com>
 */
public class BusLineViewAdapter extends RecyclerView.Adapter<BusLineItemViewHolder> {

    private List<BusLine> mDataset;

    @Override
    public BusLineItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bus_line_item, parent, false);
        return new BusLineItemViewHolder(v);
    }

    /**
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(BusLineItemViewHolder holder, int position) {
        if (mDataset != null && !mDataset.isEmpty()) {
            holder.mBusLineName.setText(mDataset.get(position).getName());
            holder.mBusLineColor.setTextColor(Color.parseColor(mDataset.get(position).getColor()));
        }
    }

    @Override
    public int getItemCount() {
        if (mDataset == null){
            return 0;
        }
        return mDataset.size();
    }

    /**
     * @param dataSet
     */
    public void setDataSet(List<BusLine> dataSet) {
        this.mDataset = dataSet;
    }
}
