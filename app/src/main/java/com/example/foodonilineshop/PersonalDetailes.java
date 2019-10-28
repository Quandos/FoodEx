package com.example.foodonilineshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class PersonalDetailes extends AppCompatActivity {


    TextView personaldetailes_input;
    EditText firstname_input, lastname_input, email_input, passwordconfirm_input,confirmpassord_input;
    Button next_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detailes);


        personaldetailes_input = (TextView) findViewById(R.id.personaldetailes_input);
        firstname_input = (EditText) findViewById(R.id.firstname_input);
        lastname_input = (EditText)findViewById(R.id.lastname_input);
        email_input =(EditText) findViewById(R.id.email_input);
        passwordconfirm_input = (EditText) findViewById(R.id.passwordconfirm_input);
        next_btn = (Button)findViewById(R.id.next_btn);


           next_btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   Intent intent = new Intent(PersonalDetailes.this, StoreDetailes.class);
                   startActivity(intent);
               }
           });
    }
}
