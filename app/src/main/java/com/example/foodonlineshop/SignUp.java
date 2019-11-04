package com.example.foodonlineshop;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    TextView singup_input, or_input, sinupasuser_input;
    Button singupasretailers_btn, confirm_btn;
    EditText firstname_input, lastname_input, email_input, password_input, confirmpassord_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        singup_input = (TextView) findViewById(R.id.singup_input);
        or_input = (TextView)findViewById(R.id.or_input);
        sinupasuser_input =(TextView) findViewById(R.id.sinupasuser_input);
        singupasretailers_btn = (Button) findViewById(R.id.singupasretailers_btn);
        confirm_btn =  (Button)findViewById(R.id.confirm_btn);
        firstname_input =(EditText) findViewById(R.id.firstname_input);
        lastname_input = (EditText)findViewById(R.id.lastname_input);
        email_input =(EditText) findViewById(R.id.email_input);
        password_input = (EditText)findViewById(R.id.password_input);
        confirmpassord_input =(EditText) findViewById(R.id.confirmpassord_input);
    }
}
