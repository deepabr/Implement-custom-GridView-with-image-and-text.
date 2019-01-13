package com.example.deepa.androidversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.content.Context;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.GridView;

import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    String[] version = {"GingerBread","HoneyComb","IceCream","JellyBean","KitKat","Lollipop"};
    int[] imageId={R.drawable.ginger,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomGrid adapter=new CustomGrid(MainActivity.this,version,imageId);
        grid=(GridView)findViewById(R.id.gridViewImageText);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You Clicked at " +version[+i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}




