package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cnrprogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cnrprogs );
    }
    public void browser9(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.startertutorials.com/blog/creating-running-c-programs.html" ) );
        startActivity( browserIntent );
    }
    public void browser10(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/aaM05-gK_88" ) );
        startActivity( browserIntent );
    }
}
