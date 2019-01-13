package com.example.deepa.androidversions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomGrid extends BaseAdapter {
    private Context context;
    private  final String[] version;
    private final int[] imageId;

    public CustomGrid(Context c,String[] version, int[] imageId) {
        this.version = version;
        this.imageId = imageId;
        this.context=c;
    }

    @Override
    public int getCount() {
        return version.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            grid = new View(context);
            grid = inflater.inflate(R.layout.grid_layout, null);
            TextView textView = (TextView) grid.findViewById(R.id.gridViewText);
            ImageView imageView = (ImageView) grid.findViewById(R.id.gridImage);
            textView.setText(version[i]);
            imageView.setImageResource(imageId[i]);
        }
        else {
            grid = (View)view;
            }
        return grid;
    }
}
