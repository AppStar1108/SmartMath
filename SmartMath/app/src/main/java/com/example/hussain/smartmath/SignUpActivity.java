package com.example.hussain.smartmath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class SignUpActivity extends Activity {
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onSignUpClick(View v){

        if(v.getId()==R.id.signupbt){

            EditText name = (EditText)findViewById(R.id.signupname);
            EditText username = (EditText)findViewById(R.id.signupusername);
            EditText pass1 = (EditText)findViewById(R.id.signuppassword);
            EditText pass2 = (EditText)findViewById(R.id.signuppassword2);

            String namestr = name.getText().toString();
            String usernamestr = username.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

//if both password dont match, show a error message
            if(!pass1str.equals(pass2str)) {
                Toast pass = Toast.makeText(SignUpActivity.this, "Please enter matching password", Toast.LENGTH_SHORT);
                pass.show();
            }
            else {
                //insert user inputted details in thw database
                User u = new User();
                u.setName(namestr);
                u.setUsername(usernamestr);
                u.setPassword(pass1str);
                helper.insertUser(u);
            }
            }



        }

    }

