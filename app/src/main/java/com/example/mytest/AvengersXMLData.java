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
        NodeList webList    = xml.getElementsByTagName("mWeb");
        NodeList partList   = xml.getElementsByTagName("mPart");
        NodeList logoList   = xml.getElementsByTagName("mLogo");
        NodeList relimgList = xml.getElementsByTagName("mRealImage");

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
            String mWeb             = webList.item(i).getFirstChild().getNodeValue();
            String mPart            = partList.item(i).getFirstChild().getNodeValue();
            String mLogo            = logoList.item(i).getFirstChild().getNodeValue();
            String mRealImage       = relimgList.item(i).getFirstChild().getNodeValue();

            data[i] = new Avenger(mID, mImageDrawable, mName, mDesc, mRealName, mAge, mFam,
                       mNoAvenger, mImp, mScream, mWeb, mPart, mLogo, mRealImage);
        }
    }

    public Avenger getAvenger(int i){


        return data[i];
    }
    public int getLength(){

        return data.length;
    }
}
