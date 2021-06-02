package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ifelse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ifelse );
    }
    public void browser39(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.tutorialspoint.com/cprogramming/if_else_statement_in_c.htm" ) );
        startActivity( browserIntent );
    }
    public void browser40(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/GjCiqzbhs3Y" ) );
        startActivity( browserIntent );
    }
}
