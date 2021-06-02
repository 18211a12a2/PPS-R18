package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pointerstopointers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pointerstopointers );
    }
    public void browser77(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.tutorialspoint.com/cprogramming/c_pointer_to_pointer.htm" ) );
        startActivity( browserIntent );
    }
    public void browser78(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/d3kd5KbGB48" ) );
        startActivity( browserIntent );
    }
}
