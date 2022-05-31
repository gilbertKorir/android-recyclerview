package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.c1, R.drawable.c10,R.drawable.c3, R.drawable.c4, R.drawable.c4,R.drawable.c5,
            R.drawable.c6,R.drawable.c7,R.drawable.c8, R.drawable.c9, R.drawable.c10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.contacts);
        s2 = getResources().getStringArray(R.array.locations);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);

        // set LayoutManager to RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}