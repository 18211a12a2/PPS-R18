package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class sorting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sorting );
    }
    public void browser131(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.geeksforgeeks.org/sorting-algorithms/" ) );
        startActivity( browserIntent );
    }

    public void browser132(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=5JRZ4vL021M" ) );
        startActivity( browserIntent );
    }
}
