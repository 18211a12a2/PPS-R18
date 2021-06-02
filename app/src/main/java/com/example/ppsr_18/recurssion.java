package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recurssion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recurssion);
        configurebutton23();
        configurebutton20();
        configurebutton24();
        configurebutton21();
        configurebutton25();
        configurebutton26();
        configurebutton27();
        configurebutton22();
        configurebutton220();
    }

    private void configurebutton220() {
        Button button220 = (Button) findViewById(R.id.button220);
        button220.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, quiz3.class));
            }

        });
    }

    private void configurebutton22() {
        Button button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, recursionvsiteration.class));
            }

        });
    }

    private void configurebutton27() {
        Button button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, arraymulti.class));
            }

        });
    }

    private void configurebutton26() {
        Button button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, array2d.class));
            }

        });
    }

    private void configurebutton25() {
        Button button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, array1d.class));
            }

        });
    }

    private void configurebutton21() {
        Button button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, recursiontypes.class));
            }

        });
    }

    private void configurebutton24() {
        Button button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, recursivearray.class));
            }

        });
    }

    private void configurebutton20() {
        Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, recursionintro.class));
            }

        });
    }

    private void configurebutton23() {
        Button button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(recurssion.this, rprogs.class));
            }

        });
    }
}
