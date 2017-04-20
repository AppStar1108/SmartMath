package com.example.hussain.smartmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {
    DatabaseHelper helper = new DatabaseHelper(this);


    public void onButtonClick(View v){


        if(v.getId()==R.id.loginbt){

            EditText a = (EditText)findViewById(R.id.logusername);
            String str = a.getText().toString();
            EditText b = (EditText)findViewById(R.id.logpassword);
            String pass = b.getText().toString();

//            String password = helper.searchPass(str);
//            if(pass.equals(password)){
//                Intent i = new Intent(LoginActivity.this, MainActivity.class);
//                i.putExtra("Username", str);
//                startActivity(i);
//            }else {
//
//                Toast temp = Toast.makeText(LoginActivity.this, "Wrong username and password, Please retry!", Toast.LENGTH_SHORT);
//                temp.show();
//            }


            Intent i = new Intent(LoginActivity.this, PetMainActivity.class);
            i.putExtra("Username", str);
            startActivity(i);
        }
//        if(v.getId()==R.id.registerbt){
//
//            Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
//            startActivity(i);
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
