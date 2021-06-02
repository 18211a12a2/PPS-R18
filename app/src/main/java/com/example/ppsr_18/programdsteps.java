package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class programdsteps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_programdsteps );
    }
    public void browser5(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "http://www.btechsmartclass.com/c_programming/C-Program-Development-Life-Cycle.html" ) );
        startActivity( browserIntent );
    }
    public void browser6(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/EiDZijMaHE4" ) );
        startActivity( browserIntent );
    }
}
