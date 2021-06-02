package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lcstats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lcstats );
        configurebutton77();
        configurebutton78();
        configurebutton79();
        configurebutton80();
        configurebutton82();
        configurebutton81();
    }

    private void configurebutton81() {
        Button button81 = (Button) findViewById(R.id.button81);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lcstats.this, bstatement.class));
            }

        });
    }

    private void configurebutton82() {
        Button button82 = (Button) findViewById(R.id.button82);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lcstats.this, gotostatement.class));
            }

        });
    }

    private void configurebutton80() {
        Button button80 = (Button) findViewById(R.id.button80);
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lcstats.this, continuestatement.class));
            }

        });
    }

    private void configurebutton79() {
        Button button79 = (Button) findViewById(R.id.button79);
        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lcstats.this, forloop.class));
            }

        });
    }

    private void configurebutton78() {
        Button button78 = (Button) findViewById(R.id.button78);
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lcstats.this, dowhileloop.class));
            }

        });
    }

    private void configurebutton77() {
        Button button77 = (Button) findViewById(R.id.button77);
        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lcstats.this, whileloop.class));
            }

        });
    }
}
