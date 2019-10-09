package com.example.mytest;

import android.content.Context;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class AvengersXMLData {

    private Avenger [] data;
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
        NodeList imageList  = xml.getElementsByTagName("mImageDrawable");
        NodeList nameList   = xml.getElementsByTagName("mName");
        NodeList descList   = xml.getElementsByTagName("mDesc");

        //traverse the list to make data
        data = new Avenger[imageList.getLength()];

        for (int i = 0; i < data.length; i++) {

            String mImageDrawable   = imageList.item(i).getFirstChild().getNodeValue();
            String mName    = nameList.item(i).getFirstChild().getNodeValue();
            String mDesc    = descList.item(i).getFirstChild().getNodeValue();

            data[i] = new Avenger(mImageDrawable, mName, mDesc);
        }
    }

    public Avenger getAvenger(int i){
        return data[i];
    }
    public int    getLength(){
        return data.length;
    }
    public String [] getNames(){

        //construct the string
        String [] names = new String[data.length];

        //populate it with names
        for (int i = 0; i < data.length; i++){
            names[i] = data[i].getmName();
        }
        return names;
    }
}
