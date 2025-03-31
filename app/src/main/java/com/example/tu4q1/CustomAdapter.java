package com.example.tu4q1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{
    private String[] data;
    public CustomAdapter (String[] data){ //constructor read in data
        this.data = data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //infalte rowlayout and return a row in the list
        View rowItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        return new MyViewHolder(rowItem);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //assign data to row/holder at a particular position

        String s = data[position];
        holder.textView.setText(s);

        // Change the icon for OS
        if (s.startsWith("Peri") || s.startsWith("Seafood")) {
            holder.imageView.setImageResource(R.drawable.star);
        }
        //on click
        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "You choice is: " + s, Toast.LENGTH_SHORT).show();
        });
    }
    @Override
    public int getItemCount() { //count the number of rows
        return data.length;
    }

    //viewHolder class to display a row
    public static class MyViewHolder extends RecyclerView.ViewHolder  {
        private TextView textView;
        private ImageView imageView;

        public MyViewHolder(View view) { //constructor
            super(view);

            this.textView = view.findViewById(R.id.label);
            this.imageView = view.findViewById(R.id.icon);
        }
    }
}