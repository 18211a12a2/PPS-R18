package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pointerstofunctions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pointerstofunctions );
    }
    public void browser89(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.studytonight.com/c/pointer-with-function-in-c.php" ) );
        startActivity( browserIntent );
    }
    public void browser90(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/BRsv3ZXoHto" ) );
        startActivity( browserIntent );
    }
}

