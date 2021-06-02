package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rprogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rprogs );
        configurebutton76();
        configurebutton83();
        configurebutton84();
        configurebutton85();

    }

    private void configurebutton85() {
        Button button85 = (Button) findViewById(R.id.button85);
        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rprogs.this, towersofhanoi.class));
            }

        });
    }

    private void configurebutton84() {
        Button button84 = (Button) findViewById(R.id.button84);
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rprogs.this, GCD.class));
            }

        });
    }

    private void configurebutton83() {
        Button button83 = (Button) findViewById(R.id.button83);
        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rprogs.this, fcatorial.class));
            }

        });
    }

    private void configurebutton76() {
        Button button76 = (Button) findViewById(R.id.button76);
        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rprogs.this, fibonacci.class));
            }

        });
    }
}
