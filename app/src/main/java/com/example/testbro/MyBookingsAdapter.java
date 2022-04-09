package com.example.testbro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyBookingsAdapter extends RecyclerView.Adapter<MyBookingsAdapter.MyViewHolder> {

    Context context;
    ArrayList<BookingObj> myBookings;

    MyBookingsAdapter(Context ctx, ArrayList<BookingObj> bookings){
        this.context = ctx;
        this.myBookings = bookings;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bookings_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        BookingObj bookingObj = myBookings.get(position);
        holder.itemName.setText(bookingObj.getItemName());
        holder.itemStartTime.setText(bookingObj.start);
        holder.itemEndTime.setText(bookingObj.end);
    }

    @Override
    public int getItemCount() {
        return myBookings.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView itemName, itemStartTime, itemEndTime;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemName = itemView.findViewById(R.id.itemName);
            itemStartTime = itemView.findViewById(R.id.itemStartTime);
            itemEndTime = itemView.findViewById(R.id.itemEndTime);
        }
    }
}
