package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class structurespointers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_structurespointers );
    }
    public void browser113(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://overiq.com/c-programming-101/pointer-to-a-structure-in-c/" ) );
        startActivity( browserIntent );
    }
    public void browser114(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/4HC8X966Q5M" ) );
        startActivity( browserIntent );
    }
}
