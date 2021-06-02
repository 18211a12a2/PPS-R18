package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class filemodes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_filemodes );
    }
    public void browser123(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "http://www.c4learn.com/c-programming/c-file-open-modes/" ) );
        startActivity( browserIntent );
    }
    public void browser124(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/nHqkiSulF6Q" ) );
        startActivity( browserIntent );
    }
}
