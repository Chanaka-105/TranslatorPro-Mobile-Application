package com.example.chanaka.translatorPro;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class Share extends Dialog {

    private Activity c;
    private Button exitButton;
    private String about_us;

    public Share(Activity a) {
        super(a);
        this.c = a;
        this.about_us = about_us;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_share);



    }
}
