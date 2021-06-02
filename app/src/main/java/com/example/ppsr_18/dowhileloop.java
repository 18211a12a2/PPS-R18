package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class dowhileloop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dowhileloop );
    }
    public void browser47(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://beginnersbook.com/2014/01/c-dowhile-loop/" ) );
        startActivity( browserIntent );
    }
    public void browser48(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/g_8uQQjt0Bg" ) );
        startActivity( browserIntent );
    }
}
