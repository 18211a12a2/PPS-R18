package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class stringsio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_stringsio );
    }
    public void browser95(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.studytonight.com/c/c-input-output-function.php" ) );
        startActivity( browserIntent );
    }
    public void browser96(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/2HasEQe5VR0" ) );
        startActivity( browserIntent );
    }
}
