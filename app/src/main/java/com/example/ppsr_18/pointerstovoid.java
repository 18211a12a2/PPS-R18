package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pointerstovoid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pointerstovoid );
    }
    public void browser87(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "http://www.circuitstoday.com/void-pointers-in-c" ) );
        startActivity( browserIntent );
    }
    public void browser88(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/9dkVR-qunnw" ) );
        startActivity( browserIntent );
    }
}
