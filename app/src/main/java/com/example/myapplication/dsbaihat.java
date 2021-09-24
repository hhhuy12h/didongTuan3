package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class dsbaihat extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Music> musicArrayList;
    MusicAdapter musicAdapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsbaihat);
        recyclerView=findViewById(R.id.rcvname);
        musicArrayList=new ArrayList<>();
        musicArrayList.add(new Music(R.drawable.eclipse,"Song tung","noi nay co anh"));
        musicArrayList.add(new Music(R.drawable.eclipse,"Song tung","noi nay co anh"));
        musicArrayList.add(new Music(R.drawable.eclipse,"Song tung","noi nay co anh"));
        musicArrayList.add(new Music(R.drawable.eclipse,"Song tung","noi nay co anh"));
        musicArrayList.add(new Music(R.drawable.eclipse,"Song tung","noi nay co anh"));


        musicAdapter= new MusicAdapter( this,musicArrayList );
        recyclerView.setAdapter(musicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}