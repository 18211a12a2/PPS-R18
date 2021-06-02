package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class enumeratedtypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_enumeratedtypes );
    }
    public void browser119(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.google.com/amp/s/www.geeksforgeeks.org/enumeration-enum-c/amp/" ) );
        startActivity( browserIntent );
    }
    public void browser120(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/YlT2w28byWM" ) );
        startActivity( browserIntent );
    }
}
