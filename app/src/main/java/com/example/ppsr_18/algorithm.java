package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class algorithm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_algorithm );
    }

    public void browser1(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.geeksforgeeks.org/difference-between-algorithm-pseudocode-and-program/" ) );
        startActivity( browserIntent );

    }

    public void browser2(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/DF2XAc07eI0" ) );
        startActivity( browserIntent );
    }
}
