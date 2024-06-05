package com.example.mycat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView Name;
            TextView Value;
            Name = itemView.findViewById(R.id.tvNormName);
            Value = itemView.findViewById(R.id.tvNormValue);
        }
    }
    @NonNull
    @Override
    public TableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.item_table_norm, parent, false);
        return new TableAdapter.ViewHolder(view);
    }
    private ArrayList<Item> items;
    private LayoutInflater inflater;
    public TableAdapter(Context context, ArrayList<Item> styles){
        this.items = styles;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public void onBindViewHolder(@NonNull TableAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
