package com.dsyu.freshxpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Checkout2Activity extends AppCompatActivity {

    private TextView deliveryTime;
    private Button confirm, a, b, c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout2);

        confirm = findViewById( R.id.confirmBtn );
        a = findViewById( R.id.pickupLocation1 );
        b = findViewById( R.id.pickupLocation2 );
        c = findViewById( R.id.pickupLocation3 );
        deliveryTime = findViewById( R.id.deliveryTime );

        confirm.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Checkout2Activity.this, DeliveryActivity.class);
                startActivity( intent );
            }
        } );

        a.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deliveryTime.setText( "Your order will arrive in 5 hours." );
            }
        } );

        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deliveryTime.setText( "Your order will arrive in 3 hours." );
            }
        } );

        c.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deliveryTime.setText( "Your order will arrive in 4 hours." );
            }
        } );

    }

}
