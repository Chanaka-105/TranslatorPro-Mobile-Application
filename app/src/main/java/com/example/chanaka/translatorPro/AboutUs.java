package com.example.chanaka.translatorPro;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class AboutUs extends Dialog {

    private Activity c;
    private Button exitButton;
    private String about_us;

    public AboutUs(Activity a) {
        super(a);
        this.c = a;
        this.about_us = about_us;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_about_us);
        setCancelable(false);


        exitButton = (Button) findViewById(R.id.btn_close);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
