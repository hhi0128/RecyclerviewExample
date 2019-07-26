package com.example.recycleapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    Context context;
    List contents;

    public RecyclerViewAdapter(int child_case, Context context, List contents){
        this.context = context;
        this.contents = contents;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new MessageVieHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){
        MessageVieHolder messageVieHolder = ((MessageVieHolder)holder);

        messageVieHolder.list_title.setText((String)(contents.get(position)));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Main2Activity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount(){
        return contents.size();
    }

    private class MessageVieHolder extends RecyclerView.ViewHolder {
        public TextView list_title;

        public MessageVieHolder (View view){
            super(view);
            list_title = view.findViewById(R.id.list_title);
        }
    }
}
