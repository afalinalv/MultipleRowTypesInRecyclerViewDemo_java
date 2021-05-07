package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by zigin on 13.11.2017.
 */

public interface RowType {
    int BUTTON_ROW_TYPE =   0;
    int IMAGE_ROW_TYPE = 1;
    int TEXT_ROW_TYPE = 2;

    int getItemViewType();

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder);
}
