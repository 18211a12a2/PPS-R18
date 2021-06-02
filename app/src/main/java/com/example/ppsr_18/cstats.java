package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cstats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cstats );
        configurebutton71();
        configurebutton72();
        configurebutton73();
        configurebutton74();
        configurebutton75();
    }

    private void configurebutton75() {
        Button button75 = (Button) findViewById(R.id.button75);
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cstats.this, switchstatements.class));
            }

        });


    }

    private void configurebutton74() {
        Button button74 = (Button) findViewById(R.id.button74);
        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cstats.this, elseif.class));
            }

        });

    }

    private void configurebutton73() {
        Button button73 = (Button) findViewById(R.id.button73);
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cstats.this, nestedifelse.class));
            }

        });
    }

    private void configurebutton72() {
        Button button72 = (Button) findViewById(R.id.button72);
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cstats.this, ifelse.class));
            }

        });
    }

    private void configurebutton71() {
        Button button71 = (Button) findViewById( R.id.button71 );
        button71.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( cstats.this, simpleif.class ) );
            }

        } );
    }

}