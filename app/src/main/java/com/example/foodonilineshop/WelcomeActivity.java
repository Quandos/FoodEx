package com.example.foodonilineshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class WelcomeActivity extends AppCompatActivity {

    Button buyerBtn, sellerBtn;
    TextView signInBtn, welcometo, foodex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        buyerBtn = (Button) findViewById(R.id.buyerBtn);
        sellerBtn = (Button) findViewById(R.id.sellerBtn);
        welcometo = (TextView) findViewById(R.id.welcometo);
        foodex = (TextView) findViewById(R.id.foodex);
        signInBtn = (TextView) findViewById(R.id.signInBtn);


        buyerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, CustomerSignUpActivity.class);
                startActivity(intent);
            }
        });

        sellerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, SellerSignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}