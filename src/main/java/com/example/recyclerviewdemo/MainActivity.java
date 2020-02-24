package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewdemo.adapter.MyRecycleViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyRecycleViewAdapter(getList()));
    }

    private ArrayList<String> getList(){
        ArrayList<String> list = new ArrayList<>();

        list.add("Jens");
        list.add("Murat");
        list.add("Anders");
        list.add("Jannick");
        list.add("Carlos");
        list.add("Carl");
        list.add("John");

        return list;
    }
}
