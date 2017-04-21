package com.example.hussain.smartmath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class customPetActivity extends Activity {

    public ImageButton btn_bowtie,btn_color,btn_mouse,btn_hat,btn_left,btn_right;
    public ImageView custom_pet,custom_bowtie, custom_hat, custom_mouse;
    //createPetActivity crt_activity;
    public int pet_color,hat_id,bowtie_id,mouse_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_pet);

        btn_bowtie=(ImageButton) findViewById(R.id.btn_bowtie);
        btn_color=(ImageButton) findViewById(R.id.btn_color);
        btn_mouse=(ImageButton) findViewById(R.id.btn_mouse);
        btn_hat=(ImageButton) findViewById(R.id.btn_hat);
        btn_left=(ImageButton) findViewById(R.id.btn_small_left);
        btn_right=(ImageButton) findViewById(R.id.btn_small_right);

        custom_pet=(ImageView)findViewById(R.id.img_customPet);
        custom_bowtie=(ImageView)findViewById(R.id.img_customBowtie);
        custom_hat=(ImageView)findViewById(R.id.img_customHat);
        custom_mouse=(ImageView)findViewById(R.id.img_customMouse);
        //pet_color=crt_activity.getPet_color();
        pet_color=0;

        btn_bowtie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bowtie_id+=1;
                if(bowtie_id>=4) bowtie_id=0;
                custom_bowtie.setBackgroundResource(android.R.color.transparent);
                switch (bowtie_id){
                    case 0:
                        custom_bowtie.setBackgroundResource(R.drawable.red_bowtie);
                        break;
                    case 1:
                        custom_bowtie.setBackgroundResource(R.drawable.yellow_bowtie);
                        break;
                    case 2:
                        custom_bowtie.setBackgroundResource(R.drawable.blue_bowtie);
                        break;
                    case 3:
                        custom_bowtie.setBackgroundResource(R.drawable.pink_bowtie);
                        break;
                    default:break;
                }

            }
        });

        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pet_color+=1;
                //crt_activity.setPet_color(pet_color);//Update my pet's color selceted before
                if (pet_color>=5) pet_color=0;

                switch (pet_color){
                    case 0:custom_pet.setBackgroundResource(R.drawable.pet_yellow);
                        break;
                    case 1:custom_pet.setBackgroundResource(R.drawable.pet_red);
                        break;
                    case 2:custom_pet.setBackgroundResource(R.drawable.pet_blue);
                        break;
                    case 3:custom_pet.setBackgroundResource(R.drawable.pet_pink);
                        break;
                    case 4:custom_pet.setBackgroundResource(R.drawable.pet_green);
                        break;
                    default:break;
                }

            }
        });

        btn_hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hat_id+=1;
                //crt_activity.setPet_color(pet_color);//Update my pet's color selceted before
                if (hat_id>=3) hat_id=0;

                switch (hat_id){
                    case 0:custom_hat.setBackgroundResource(R.drawable.party_hat);
                        break;
                    case 1:custom_hat.setBackgroundResource(R.drawable.top_hat);
                        break;
                    case 2:custom_hat.setBackgroundResource(R.drawable.winter_hat);
                        break;
                    default:break;
                }


            }
        });

        btn_mouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mouse_id+=1;
                //crt_activity.setPet_color(pet_color);//Update my pet's color selceted before
                if (mouse_id>=3) mouse_id=0;

                switch (mouse_id){
                    case 0:custom_mouse.setBackgroundResource(R.drawable.simple_moustache);
                        break;
                    case 1:custom_mouse.setBackgroundResource(R.drawable.curly_moustache);
                        break;
                    case 2:custom_mouse.setBackgroundResource(R.drawable.long_moustache);
                        break;
                    default:break;
                }

            }
        });

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
