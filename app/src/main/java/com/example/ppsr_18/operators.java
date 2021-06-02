package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class operators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_operators );
    }
    public void browser23(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.javatpoint.com/c-operators" ) );
        startActivity( browserIntent );
    }
    public void browser24(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/playlist?list=PLBlnK6fEyqRhqQV_MzlT8xsPQnsGcMdIo" ) );
        startActivity( browserIntent );
    }
}
