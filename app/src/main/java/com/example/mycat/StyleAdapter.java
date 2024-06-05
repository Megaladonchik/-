package com.example.mycat;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StyleAdapter extends RecyclerView.Adapter<StyleAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
    TextView Style;
    ImageView Table;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Style = itemView.findViewById(R.id.Style);

            itemView.setOnClickListener((v)->{
                Dialog dialog;
                dialog = new Dialog(itemView.getContext());
                dialog.setContentView(R.layout.style_meny);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(itemView.getContext().getDrawable(R.drawable.meny_background));
                TextView tv = dialog.findViewById(R.id.Style);
                //ImageView Tabletv = dialog.findViewById(R.id.Table);
                //Tabletv = dialog.findViewById(this.Table.getId());
                tv.setText(this.Style.getText());

dialog.show();

            });

        }
        public void setStyle(String StyleName){
            this.Style.setText(StyleName);
        }
        //public  void setTable(int resourse){this.Table.setImageResource(resourse);}
    }
    private ArrayList<Style> styles;
    private LayoutInflater inflater;
    public StyleAdapter(Context context, ArrayList<Style> styles){
        this.styles = styles;
        inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public StyleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.style_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull StyleAdapter.ViewHolder holder, int position) {

        Style item = styles.get(position);
        //holder.setTable(item.getImageResourse());
        holder.setStyle(item.getStyleName());
    }
    @Override
    public int getItemCount() {
        return styles.size();
    }
}