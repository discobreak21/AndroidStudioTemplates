package com.example.recyclerviewtemplate;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private  ArrayList<String> arrayList;


    public MyAdapter(ArrayList<String> incomingArrayList) {
        arrayList = incomingArrayList;
    }


	//Sets up, how the Views in the ViewHolder have to look like and has to return the ViewHolder
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Option 1: Set up given 'look' from Android
        //View viewThatGetsDisplayed = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        //Option 2: Set up your own 'look' via a TextView which functions as a template (therefore you have to create an other .xml-file)
        View viewThatGetsDisplayed = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(viewThatGetsDisplayed);

        return viewHolder;
    }

	//this method is called as many times as the getItemCount()-Result
	//-> for each item of the ArrayList once
	//here it sets the text for each entry of the RecyclerView
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
		
        holder.textView.setText(arrayList.get(position));

    }

	//defines how many times the onBindViewHolder()-Method is called
    @Override
    public int getItemCount() {
        
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(View incomingTextView){
            super(incomingTextView);
            //Option 1
            //textView = (TextView) incomingTextView;

            //Option 2
            textView = incomingTextView.findViewById(R.id.textViewForRecyclerView);
        }
    }

}
