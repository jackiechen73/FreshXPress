package com.dsyu.freshxpress;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class FruitsActivity extends AppCompatActivity {

    ImageButton peach, blueberry;
    FloatingActionButton bag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fruits );

        peach = findViewById( R.id.peachBtn );
        blueberry = findViewById( R.id.blueberryBtn );
        bag = findViewById( R.id.fab );

        peach.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitsActivity.this, DescriptionActivity.class);
                intent.putExtra( "fruit", "peach" );
                startActivity( intent );
            }
        } );

        blueberry.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitsActivity.this, DescriptionActivity.class);
                intent.putExtra( "fruit", "blueberry" );
                startActivity( intent );
            }
        } );

        bag.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitsActivity.this, Checkout1Activity.class);
                startActivity( intent );
            }
        } );
    }
}

