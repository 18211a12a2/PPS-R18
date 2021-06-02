package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class array2d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_array2d );
    }
    public void browser61(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://beginnersbook.com/2014/01/2d-arrays-in-c-example/" ) );
        startActivity( browserIntent );
    }
    public void browser62(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/J1aQ9JN4vZY" ) );
        startActivity( browserIntent );
    }
}
