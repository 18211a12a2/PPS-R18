package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class towersofhanoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_towersofhanoi );
    }
    public void browser71(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.google.com/amp/s/www.geeksforgeeks.org/c-program-for-tower-of-hanoi/amp/" ) );
        startActivity( browserIntent );
    }
    public void browser72(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/YstLjLCGmgg" ) );
        startActivity( browserIntent );
    }
}
