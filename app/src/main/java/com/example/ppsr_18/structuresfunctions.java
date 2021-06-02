package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class structuresfunctions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_structuresfunctions );
    }
    public void browser111(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://overiq.com/c-programming-101/structures-and-functions-in-c/" ) );
        startActivity( browserIntent );
    }
    public void browser112(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/VF40lxbXR_0" ) );
        startActivity( browserIntent );
    }
}
