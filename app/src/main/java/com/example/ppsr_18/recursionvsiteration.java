package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class recursionvsiteration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_recursionvsiteration );
    }
    public void browser73(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "http://www2.hawaii.edu/~tp_200/lectureNotes/recursion.htm" ) );
        startActivity( browserIntent );
    }
    public void browser74(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/kx6DfrYfWnQ" ) );
        startActivity( browserIntent );
    }
}
