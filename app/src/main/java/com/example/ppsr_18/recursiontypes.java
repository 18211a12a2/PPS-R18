package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class recursiontypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_recursiontypes );
    }
    public void browser55(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.sparknotes.com/cs/recursion/whatisrecursion/section2/" ) );
        startActivity( browserIntent );
    }
    public void browser56(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/vXlR1KGnOkM" ) );
        startActivity( browserIntent );
    }
}
