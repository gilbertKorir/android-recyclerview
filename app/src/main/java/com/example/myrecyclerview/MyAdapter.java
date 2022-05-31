package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String data1[];
    String data2[];
    int images[];

    public MyAdapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    //set the return type for onCreateViewHolder explicitly to MyViewHolder.
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mycontacts.setText(data1[position]);
        holder.mylocations.setText(data2[position]);
        holder.myicons.setImageResource(images[position]);
    }

    //returning the number of objects
    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mycontacts,mylocations;
        ImageView myicons;

        // get the reference of item view's
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mycontacts = itemView.findViewById(R.id.mycontact);
            mylocations = itemView.findViewById(R.id.mylocation);
            myicons = itemView.findViewById(R.id.myicon);
        }
    }
}
