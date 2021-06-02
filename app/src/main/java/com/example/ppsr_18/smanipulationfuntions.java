package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class smanipulationfuntions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_smanipulationfuntions );
    }
    public void browser99(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.includehelp.com/c-programs/string-manipulation-programs.aspx" ) );
        startActivity( browserIntent );
    }
    public void browser100(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/b-5beEPeV0c" ) );
        startActivity( browserIntent );
    }
}
