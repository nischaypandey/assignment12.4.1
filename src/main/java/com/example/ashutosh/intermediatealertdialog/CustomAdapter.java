package com.example.ashutosh.intermediatealertdialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ashutosh on 30-06-2017.
 */

//Creating Custom Adapter for ListView which is extending BaseAdapter class.
public class CustomAdapter extends BaseAdapter
{

    ArrayList<Person> arrayList;    //ArrayList of Person objects which will be stored in ListView.
    Context context;    //Context of Current Activity.

    //Constructor.
    public CustomAdapter(Context context,ArrayList<Person> list)
    {
        arrayList=list;
        this.context=context;
    }

    @Override
    //Method to get number of elements in the ArrayList.
    public int getCount() {
        return arrayList.size();
    }

    @Override
    //Method to get particular element from the ArrayList.
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    //Method to get ID of particular elements in the ArrayList.
    public long getItemId(int position) {
        return (long)position;
    }

    @Override
    //getView method to create the layout and setting Values in the ArrayList in the layout.
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Setting View to the Layout file.
        convertView= LayoutInflater.from(context).inflate(R.layout.list_raw,null);

        //Setting TextViews with their IDs in the layout file.
        TextView name_tv=(TextView)convertView.findViewById(R.id.name_tv);
        TextView phone_tv=(TextView)convertView.findViewById(R.id.phone_tv);
        TextView dob_tv=(TextView)convertView.findViewById(R.id.dob_tv);

        //Setting text to the TextViews.
        name_tv.setText(arrayList.get(position).nameOfPerson);
        phone_tv.setText(arrayList.get(position).phoneNumber);
        dob_tv.setText(arrayList.get(position).dateBirth);

        return convertView;    //returning View.
    }
}
