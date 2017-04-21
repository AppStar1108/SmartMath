package com.example.hussain.smartmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.hussain.smartmath.R.layout;

public class PetMainActivity extends Activity {

    ImageButton btn_home, btn_shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_pet_main);

        btn_home = (ImageButton) findViewById(R.id.btn_home);
        btn_shop=(ImageButton) findViewById(R.id.btn_cart);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toShop=new Intent(PetMainActivity.this, createPetActivity.class);
                startActivity(toShop);
                //finish();
            }
        });

    }

}
