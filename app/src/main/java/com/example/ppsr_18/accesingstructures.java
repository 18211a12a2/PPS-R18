package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class accesingstructures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_accesingstructures );
    }

    public void browser105(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://codeforwin.org/2018/07/how-to-declare-initialize-and-access-structures-in-c.html" ) );
        startActivity( browserIntent );
    }

    public void browser106(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/2DidKZmwNMo" ) );
        startActivity( browserIntent );
    }
}
