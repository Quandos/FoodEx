package com.example.foodonilineshop;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.foodonilineshop.CustomerSignUpActivity.Terms_And_Condition_RESULT;

public class SellerSignUpActivity extends AppCompatActivity {

    TextView seller_information , storen_input , terms , city_input;
    EditText fstore_input , address_input , contactn_input , hstore_input  ;
    Button submit_btn1 , cancel_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_sign_up);

        seller_information = (TextView)  findViewById(R.id.seller_information);
        storen_input = (TextView)  findViewById(R.id.storen_input);
        city_input = (TextView)  findViewById(R.id.city_input);
        terms = (TextView)  findViewById(R.id.terms);
        fstore_input = (EditText)  findViewById(R.id.fstore_input);
        address_input = (EditText)  findViewById(R.id.address_input);
        contactn_input = (EditText)  findViewById(R.id.contactn_input);
        hstore_input = (EditText)  findViewById(R.id.hstore_input);
        submit_btn1 = (Button)  findViewById(R.id.submit_btn1);
        cancel_btn = (Button)  findViewById(R.id.cancel_btn);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerSignUpActivity.this,SellerTermsActivity.class);
                startActivityForResult(intent, Terms_And_Condition_RESULT);
            }
        });

        Spinner mySpinner = (Spinner) findViewById(R.id.mySpineer);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                Toast.makeText(SellerSignUpActivity.this, selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == Terms_And_Condition_RESULT) {
            //Activate the submit button if the result is successful
            Bundle extras = data.getExtras();
            boolean checked = extras.getBoolean("checked");
            if (checked) {
                submit_btn1.setEnabled(true);
            } else {
                submit_btn1.setEnabled(false);
                Toast.makeText(SellerSignUpActivity.this,
                        "You must accept the terms and condition to proceed",
                        Toast.LENGTH_LONG).show();
            }
        }

    }
}


