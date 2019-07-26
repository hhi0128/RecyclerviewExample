package com.example.recycleapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list_recyclerview;
    List contents;
    List contents_get;
    List oldPost_get;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize(){

        contents = new ArrayList<>();
        contents_get = new ArrayList<>();
        oldPost_get = new ArrayList<>();

        for(int i = 0 ; i < 100 ; i++){
            contents.add(i + "  번째 줄");
        }

        list_recyclerview = (RecyclerView)findViewById(R.id.list_recyclerview);
        list_recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        int child_case = 0;
        list_recyclerview.setAdapter(new RecyclerViewAdapter(child_case, this, contents));

    }
}
