package com.example.mytest;

import android.content.Context;
import android.util.Log;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class AvengersXMLData {

    public Avenger [] data;
    private Context context;

    public AvengersXMLData(Context c){
        this.context = c;

        //get an inputstream to xml
        InputStream stream = this.context.getResources().openRawResource(R.raw.avengers);

        //parse xml to a document
        DocumentBuilder builder = null;
        Document xml = null;
        try{
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            xml = builder.parse(stream);

        }catch (Exception e) {}



        //slice document into 5 NodeList for name, image, etc
        NodeList idList     = xml.getElementsByTagName("mID");
        NodeList imageList  = xml.getElementsByTagName("mImageDrawable");
        NodeList nameList   = xml.getElementsByTagName("mName");
        NodeList descList   = xml.getElementsByTagName("mDesc");
        NodeList realimList = xml.getElementsByTagName("mRealName");
        NodeList ageList    = xml.getElementsByTagName("mAge");
        NodeList famList    = xml.getElementsByTagName("mFam");
        NodeList noAvgList  = xml.getElementsByTagName("mNoAvenger");
        NodeList impList    = xml.getElementsByTagName("mImp");
        NodeList musicList  = xml.getElementsByTagName("mScream");

        //traverse the list to make data
        data = new Avenger[nameList.getLength()];

        for (int i = 0; i < data.length; i++) {

            String mID              = idList.item(i).getFirstChild().getNodeValue();
            String mImageDrawable   = imageList.item(i).getFirstChild().getNodeValue();
            String mName            = nameList.item(i).getFirstChild().getNodeValue();
            String mDesc            = descList.item(i).getFirstChild().getNodeValue();
            String mRealName        = realimList.item(i).getFirstChild().getNodeValue();
            String mAge             = ageList.item(i).getFirstChild().getNodeValue();
            String mFam             = famList.item(i).getFirstChild().getNodeValue();
            String mNoAvenger       = noAvgList.item(i).getFirstChild().getNodeValue();
            String mImp             = impList.item(i).getFirstChild().getNodeValue();
            String mScream          = musicList.item(i).getFirstChild().getNodeValue();
            Log.e("Rishi", "inside xmlfile");

            data[i] = new Avenger(mID, mImageDrawable, mName, mDesc, mRealName, mAge, mFam, mNoAvenger, mImp, mScream);
        }
    }

    public Avenger getAvenger(int i){


        return data[i];
    }
    public int getLength(){

        return data.length;
    }
    /*public String [] getNames(){

        //construct the string
        String [] names = new String[data.length];

        //populate it with names
        for (int i = 0; i < data.length; i++){
            names[i] = data[i].getmName();
        }
        return names;
    }
    public String [] getDescs(){

        //construct the string
        String [] descs = new String[data.length];

        //populate it with names
        for (int i = 0; i < data.length; i++){
            descs[i] = data[i].getmDesc();
        }
        return descs;
    }
    public String [] getImages(){

        //construct the string
        String [] images = new String[data.length];

        //populate it with names
        for (int i = 0; i < data.length; i++){
            images[i] = data[i].getmImageDrawable();
        }
        return images;
    }*/
}
