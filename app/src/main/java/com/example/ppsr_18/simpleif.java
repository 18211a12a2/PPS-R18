package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class simpleif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_simpleif );
    }
    public void browser37(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.tutorialspoint.com/cprogramming/if_statement_in_c.htm" ) );
        startActivity( browserIntent );
    }
    public void browser38(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/GI2aa5MaYWU" ) );
        startActivity( browserIntent );
    }
}

