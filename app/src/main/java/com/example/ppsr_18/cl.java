package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cl );
    }
    public void browser7(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.toppr.com/guides/computer-aptitude-and-knowledge/basics-of-computers/computer-languages/" ) );
        startActivity( browserIntent );
    }
    public void browser8(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/aYjGXzktatA" ) );
        startActivity( browserIntent );
    }
}
