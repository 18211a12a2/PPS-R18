package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class recursionintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_recursionintro );
    }

    public void browser53(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.javatpoint.com/recursion-in-c" ) );
        startActivity( browserIntent );
    }

    public void browser54(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/kepBmgvWNDw" ) );
        startActivity( browserIntent );
    }
}
