package com.example.mytest;

import android.content.Context;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


    public class AvengerAdapter extends ArrayAdapter<Avenger> {

        private Context mContext;
        private List<Avenger> moviesList = new ArrayList<>();

        public AvengerAdapter(@NonNull Context context, @LayoutRes ArrayList<Avenger> list) {
            super(context, 0 , list);
            mContext = context;
            moviesList = list;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItem = convertView;
            if(listItem == null)
                listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

            Avenger currentMovie = moviesList.get(position);

            ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
            image.setImageResource(currentMovie.getmImageDrawable());

            TextView name = (TextView) listItem.findViewById(R.id.textView_name);
            name.setText(currentMovie.getmName());

            TextView release = (TextView) listItem.findViewById(R.id.textView_release);
            release.setText(currentMovie.getmRelease());

            return listItem;
        }
}
