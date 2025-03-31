package com.example.tu4q1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String[] values = new String[] {
                "Peri Peri Chicken", "Supreme", "Seafood",
                "Italian", "Meat lovers"};

        //declare a recyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //create an instant of CustomAdapter with data from values array
        CustomAdapter myAdapter = new CustomAdapter(values);

        //set layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //set Adapter
        recyclerView.setAdapter(myAdapter);
        //add divider
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


    }
}