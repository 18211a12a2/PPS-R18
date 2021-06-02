package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class functioncategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_functioncategories );
    }

    public void browser27(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.studytonight.com/c/type-of-functions-and-recursion.php" ) );
        startActivity( browserIntent );
    }

    public void browser28(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/qPxcGDQrJlg" ) );
        startActivity( browserIntent );
    }
}

