package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class parameterpassing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_parameterpassing );
    }
    public void browser29(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://courses.cs.washington.edu/courses/cse341/98sp/general/parameters.html" ) );
        startActivity( browserIntent );
    }
    public void browser30(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/vPLXP3K5XeY" ) );
        startActivity( browserIntent );
    }
}

