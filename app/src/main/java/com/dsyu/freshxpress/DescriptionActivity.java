package com.dsyu.freshxpress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    String fruit;
    TextView item, price, description;
    ImageView itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_description );

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics( dm );

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout( (int) (width * 0.8), (int) (height * 0.7) );
//----------------------------
        item = findViewById( R.id.itemLabel );
        itemImage = findViewById( R.id.itemImageView );
        price = findViewById( R.id.priceLabel );
        description = findViewById( R.id.descriptionText );

        Intent intent = getIntent();
        fruit = intent.getStringExtra( "fruit");

        if (fruit.equals("peach")) {
            item.setText( "Peach" );
            int id = getResources().getIdentifier("com.dsyu.freshxpress:drawable/" + "peach", null, null);
            itemImage.setImageResource( id );
            price.setText( "$0.35" );
            description.setText( "The peach is a round, coloured, juicy fruit, typically eaten in summer. Many countries produce peaches, reason why we can eat this fruit all throughout the year. It is used for consumption in fresh and for industry, specially tinned." );
        }
    }
}
