package com.example.mytest;

import android.content.Context;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


    public class AvengerAdapter extends ArrayAdapter<Avenger> {

        private Context mContext;
        private List<Avenger> AvengerList = new ArrayList<>();
        private Avenger data = null;
        int resource;

        public AvengerAdapter(Context context, int resource, List<Avenger> AvengerList) {
            super(context, resource , AvengerList);
            this.mContext = context;
            this.resource = resource;
            this.AvengerList = AvengerList;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItem = convertView;
            if (listItem == null)
                listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

            Avenger currAvenger = AvengerList.get(position);



            ImageView image = (ImageView) listItem.findViewById(R.id.imageView_poster);

            AssetManager assetManager = mContext.getAssets();
            InputStream inputStream = null;
            try {
                inputStream = assetManager.open("avengers/"+currAvenger.getmID()+"/"+currAvenger.getmImageDrawable());
            } catch (IOException e) {
                e.printStackTrace();
            }
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            image.setImageBitmap(bitmap);


            TextView name = (TextView) listItem.findViewById(R.id.textView_name);
            name.setText(currAvenger.getmName());

            TextView desc = (TextView) listItem.findViewById(R.id.textView_desc);
            desc.setText(currAvenger.getmDesc());


            return listItem;
        }
}
