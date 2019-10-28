package com.example.foodonilineshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;

public class CustomerTermsActivity extends AppCompatActivity {

    TextView customer_terms;
    CheckBox check_box;
    ScrollView top_part;
    Button accept_btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_terms);

        customer_terms = (TextView) findViewById(R.id.customer_terms);
        check_box = (CheckBox) findViewById(R.id.check_box);
//        top_part = (ScrollView) findViewById(R.id.top_part);
        accept_btn1 = (Button) findViewById(R.id.accept_btn1);

        accept_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = check_box.isChecked();
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
