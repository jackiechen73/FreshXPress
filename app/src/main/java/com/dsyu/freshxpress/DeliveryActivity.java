package com.dsyu.freshxpress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DeliveryActivity extends AppCompatActivity {

    private Button orderAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_delivery );

        orderAgain = findViewById( R.id.orderAgainBtn );

        orderAgain.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(DeliveryActivity.this, MainActivity.class) );
            }
        } );
    }
}
