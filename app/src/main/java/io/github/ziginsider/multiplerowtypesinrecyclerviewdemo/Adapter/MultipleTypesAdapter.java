package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Adapter;

import androidx.recyclerview.widget.RecyclerView;

import android.view.ViewGroup;

import java.util.List;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;

/**
 * Created by zigin on 14.11.2017.
 */

public class MultipleTypesAdapter extends RecyclerView.Adapter {

    private List<RowType> dataSet;

    public MultipleTypesAdapter(List<RowType> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int getItemViewType(int position) {
        return dataSet.get(position).getItemViewType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolderFactory.create(parent, viewType);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        dataSet.get(position).onBindViewHolder(holder);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
