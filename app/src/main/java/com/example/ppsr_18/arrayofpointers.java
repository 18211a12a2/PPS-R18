package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class arrayofpointers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_arrayofpointers );
    }
    public void browser85(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://overiq.com/c-programming-101/array-of-pointers-in-c/" ) );
        startActivity( browserIntent );
    }
    public void browser86(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/ibj_AKOxpHo" ) );
        startActivity( browserIntent );
    }
}
