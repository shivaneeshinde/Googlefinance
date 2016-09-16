package com.shivaneeshindegmail.googlefinance;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by DELL on 26/06/2016.
 */
public class Menu extends ListActivity {

    String classes[]={"startingpoint","Email","Data","OpenedClass"};

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        String cheese=classes[position];
        super.onListItemClick(l,v,position,id);
        try {
            Class ourClass = Class.forName("com.shivaneeshindegmail.newboston." + cheese);
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
