package com.paez.edwin.locomotor;

/**
 * Created by PC on 18/03/2018.
 */

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaTresAdapter extends BaseAdapter {

    private Context context;
    private List<ListaTres> items;

    public ListaTresAdapter(Context context, List<ListaTres> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.lista_tres, parent, false);
        }

        // Set data into the view.
        ImageView ivItem3 = (ImageView) rowView.findViewById(R.id.ivItem3);
        TextView tvTitle3 = (TextView) rowView.findViewById(R.id.tvTitle3);
        TextView tvDescripcion3 = (TextView) rowView.findViewById(R.id.tvDescripcion3);
        ListaTres item = this.items.get(position);
        tvTitle3.setText(item.getTitle3());
        tvDescripcion3.setText(item.getDescripcion3());
        ivItem3.setImageResource(item.getImage3());

        return rowView;
    }

}