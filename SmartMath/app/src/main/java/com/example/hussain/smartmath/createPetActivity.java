package com.example.hussain.smartmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class createPetActivity extends Activity {

    ImageButton btn_right,btn_left;
    Button btn_create;
    ImageView img_pet;

    public int pet_color;
    public String[] pet_name;

    public void setPet_name(String[] pet_name) {
        this.pet_name = pet_name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_pet);

        pet_color=0;

        btn_right=(ImageButton) findViewById(R.id.btn_right);
        btn_left=(ImageButton) findViewById(R.id.btn_left);
        btn_create=(Button) findViewById(R.id.btn_create);
        img_pet=(ImageView) findViewById(R.id.img_customPet);

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pet_color+=1;
                if (pet_color>=5) pet_color=0;

                switch (pet_color){
                    case 0:img_pet.setImageResource(R.drawable.pet_yellow);
                        break;
                    case 1:img_pet.setImageResource(R.drawable.pet_red);
                        break;
                    case 2:img_pet.setImageResource(R.drawable.pet_blue);
                        break;
                    case 3:img_pet.setImageResource(R.drawable.pet_pink);
                        break;
                    case 4:img_pet.setImageResource(R.drawable.pet_green);
                        break;
                    default:break;
                }
            }
        });

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pet_color-=1;
                if (pet_color<=0) pet_color=4;

                switch (pet_color){
                    case 0:img_pet.setImageResource(R.drawable.pet_yellow);
                        break;
                    case 1:img_pet.setImageResource(R.drawable.pet_red);
                        break;
                    case 2:img_pet.setImageResource(R.drawable.pet_blue);
                        break;
                    case 3:img_pet.setImageResource(R.drawable.pet_pink);
                        break;
                    case 4:img_pet.setImageResource(R.drawable.pet_green);
                        break;
                    default:break;
                }



            }
        });

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toCreate=new Intent(createPetActivity.this, customPetActivity.class);
                startActivity(toCreate);
                finish();

            }
        });



    }
}
