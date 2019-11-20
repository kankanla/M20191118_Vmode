package com.kankanla.m20191118_vmode.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedHashMap;

public class MainViewModel extends ViewModel {
    private final String TAG = "###  MainViewModel";
    private MutableLiveData<LinkedHashMap<Integer, String>> ldata;

    public MainViewModel() {
        ldata = new MutableLiveData<>();
    }

    interface MainViewCallback {
        void ViewModelok();
    }

    protected void setData(final MainViewCallback mainViewCallback) {
        XMLHttp xmlHttp = new XMLHttp();
        xmlHttp.getXMLData(new XMLHttp.XMLHttpCallback() {
            @Override
            public void httpok(LinkedHashMap<Integer, String> lineListMap) {
                ldata.postValue(lineListMap);
                mainViewCallback.ViewModelok();
            }
        });
    }

    public LiveData<LinkedHashMap<Integer, String>> VmodeData() {
        return ldata;
    }


}
