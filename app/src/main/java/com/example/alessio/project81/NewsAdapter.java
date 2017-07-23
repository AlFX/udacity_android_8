package com.example.alessio.project81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context) {
        super(context, -1, new ArrayList<News>());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /* inflate when there is no layout to be populated */
        if (convertView == null) {
            /* find reference to the item to be inflated */
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        /* get reference of empty TextViews */
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView author = (TextView) convertView.findViewById(R.id.author);
        TextView date = (TextView) convertView.findViewById(R.id.date);
        TextView section = (TextView) convertView.findViewById(R.id.section);

        /* populate with custom object fields values, with helper methods */
        News currentNews = getItem(position);
        title.setText(currentNews.getTitle());
        author.setText(currentNews.getAuthor());
        date.setText(currentNews.getDate());
        section.setText(currentNews.getSection());

        return convertView;
    }
}
