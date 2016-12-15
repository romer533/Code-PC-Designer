package ru.myitschool.pcdesigner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainListViewAdapter extends BaseAdapter {

    private List<MainListView> listView;
    private LayoutInflater layoutInflater;

    public MainListViewAdapter(Context context, List<MainListView> listView) {
        this.listView = listView;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listView.size();
    }

    @Override
    public Object getItem(int position) {
        return listView.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_main_list_view_menu, parent, false);
        }

        MainListView mainListView = getMainListView(position);

        TextView listViewElement = (TextView) view.findViewById(R.id.list_view_element);
        listViewElement.setText(mainListView.getName());

        ImageView imageListViewElement = (ImageView) view.findViewById(R.id.image_list_view_element);
        imageListViewElement.setImageResource(mainListView.getIcon());

        return view;

    }

    private MainListView getMainListView(int position) {
        return (MainListView) getItem(position);
    }

}
