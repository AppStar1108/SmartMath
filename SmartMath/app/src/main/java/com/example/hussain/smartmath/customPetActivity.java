package com.example.hussain.smartmath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class customPetActivity extends Activity {

    ImageButton btn_bowtie,btn_color,btn_mouse,btn_hat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_pet);

        btn_bowtie=(ImageButton) findViewById(R.id.btn_bowtie);
        btn_color=(ImageButton) findViewById(R.id.btn_color);
        btn_mouse=(ImageButton) findViewById(R.id.btn_mouse);
        btn_hat=(ImageButton) findViewById(R.id.btn_hat);

        ImageView custom_pet=(ImageView)findViewById(R.id.img_customPet);
        ImageView custom_bowtie=(ImageView)findViewById(R.id.img_customBowtie);
        ImageView custom_color=(ImageView)findViewById(R.id.img_customHat);
        ImageView custom_mouse=(ImageView)findViewById(R.id.img_customMouse);

        btn_bowtie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_mouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
