package com.kankanla.m20191118_vmode.ui.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

public class XMLHttp {
    private final String TAG = "###  XMLHttp";
    private String XMLURL = "http://www.ekidata.jp/api/l/11302.xml";

    public XMLHttp() {

    }

    interface XMLHttpCallback {
        void httpok(LinkedHashMap<Integer, String> lineListMap);
    }

    public XMLHttp(String XMLURL) {
        this.XMLURL = XMLURL;
    }

    protected void getXMLData(final XMLHttpCallback xmlHttpCallback) {

        new Thread(new Runnable() {
            @Override
            public void run() {


            }
        }).start();
    }


    private void getXMLInputString() {
        URL url = null;
        try {
            url = new URL(XMLURL);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("GET");
            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = httpURLConnection.getInputStream();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
