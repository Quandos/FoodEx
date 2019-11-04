package com.example.foodonlineshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SellerTermsActivity extends AppCompatActivity {

    TextView seller_terms , accept_btn2;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_terms);

        //comment

        seller_terms = (TextView)findViewById(R.id.seller_terms);
        accept_btn2 = (TextView)findViewById(R.id.accept_btn2);
        check = (CheckBox) findViewById(R.id.check);

        accept_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = check.isChecked();
                Intent intent = new Intent();
                intent.putExtra("checked", checked);

                if(checked) {
                    setResult(RESULT_OK, intent);
                }else {
                    setResult(RESULT_CANCELED, intent);
                }
                finish();
            }
        });

    }
}
