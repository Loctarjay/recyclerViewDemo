package com.example.recyclerviewdemo.View;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        LinearLayout linearLayout = (LinearLayout)itemView;
        textView = linearLayout.findViewById(R.id.ListedView);
    }
}
