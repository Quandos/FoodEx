package com.example.foodonilineshop;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CustomerSignUpActivity extends AppCompatActivity {

    public static int  Terms_And_Condition_RESULT;
    TextView personaldetails , csingup_terms , city_input;
    EditText fname_input , lastname_input , email_input , passwordc_input , confirmpassword_input;
    Button submit_btn , cancel_btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_sign_up);

        personaldetails = (TextView) findViewById(R.id.personaldetails);
        csingup_terms = (TextView) findViewById(R.id.csingup_terms);
        city_input = (TextView) findViewById(R.id.city_input);
        fname_input = (EditText) findViewById(R.id.fname_input);
        lastname_input = (EditText) findViewById(R.id.lastname_input);
        email_input = (EditText) findViewById(R.id.email_input);
        passwordc_input = (EditText) findViewById(R.id.passwordc_input);
        confirmpassword_input = (EditText) findViewById(R.id.confirmpassword_input);
        submit_btn = (Button) findViewById(R.id.submit_btn);
        cancel_btn1 = (Button) findViewById(R.id.cancel_btn1);


        csingup_terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerSignUpActivity.this,CustomerTermsActivity.class);
                startActivityForResult(intent, Terms_And_Condition_RESULT);
            }
        });

        Spinner mySpinner = (Spinner) findViewById(R.id.mySpineer);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                Toast.makeText(CustomerSignUpActivity.this, selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode==Terms_And_Condition_RESULT){
            //Activate the submit button if the result is successful
            Bundle extras = data.getExtras();
            boolean checked = extras.getBoolean("checked");
            if(checked){
                submit_btn.setEnabled(true);
            }else{
                submit_btn.setEnabled(false);
                Toast.makeText(CustomerSignUpActivity.this,
                        "You must accept the terms and condition to proceed",
                        Toast.LENGTH_LONG).show();
            }

//            if(resultCode == RESULT_OK) {
//                submit_btn.setEnabled(true);
//            }else if(resultCode == RESULT_CANCELED);
//                submit_btn.setEnabled(false);
//            Toast.makeText(CustomerSignUpActivity.this,
//                    "You must accept the terms and condition to proceed",
//                    Toast.LENGTH_LONG).show();
            }

        }
    }
