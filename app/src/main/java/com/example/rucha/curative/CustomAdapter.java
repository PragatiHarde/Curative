package com.example.rucha.curative;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rucha.curative.MainActivity;
import com.example.rucha.curative.R;

import static com.example.rucha.curative.Dogs_list.dogsImages;
import static com.example.rucha.curative.Dogs_list.dogsNameList;

/**
 * Created by Rucha on 09-03-2018.
 */

public class CustomAdapter extends BaseAdapter {

    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(Dogs_list mainActivity, String[] dogsNameList, int[] dogsImages) {
        // TODO Auto-generated constructor stub
        result=dogsNameList;
        context=mainActivity;
        imageId=dogsImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView dogs_text;
        ImageView dogs_img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.doggy_gridview, null);
        holder.dogs_text =(TextView) rowView.findViewById(R.id.dogs_texts);
        holder.dogs_img =(ImageView) rowView.findViewById(R.id.dogs_images);

        holder.dogs_text.setText(result[position]);
        holder.dogs_img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {


            //input ur own code here (action u wanna perform on clicking instead of toast :)

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_SHORT).show();
            }
        });

        return rowView;
    }

}
