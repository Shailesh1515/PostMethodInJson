package com.example.postmethodinjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Base_Adapter extends BaseAdapter {
    Context context;
    List<DataModel>list;
    LayoutInflater inflater;

    public Base_Adapter(Context context, List<DataModel> list) {
        this.context = context;
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =inflater.inflate(R.layout.item,null);
        TextView question=convertView.findViewById(R.id.question);
        TextView answer=convertView.findViewById(R.id.answer);

        DataModel model=list.get(position);
        answer.setText(model.getAnswer());
        question.setText(model.getQuestion());

        return convertView;
    }
}
