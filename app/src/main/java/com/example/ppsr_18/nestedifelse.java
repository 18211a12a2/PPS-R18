package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class nestedifelse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_nestedifelse );
    }
    public void browser41(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.tutorialspoint.com/cprogramming/nested_if_statements_in_c.htm" ) );
        startActivity( browserIntent );
    }
    public void browser42(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://youtu.be/K5lmztdO40A" ) );
        startActivity( browserIntent );
    }
}
