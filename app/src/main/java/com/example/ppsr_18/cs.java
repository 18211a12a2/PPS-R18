package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);
        confugurebutton6();
        configurebutton9();
        configurebutton14();
        configurebutton15();
        configurebutton16();
        configurebutton17();
        configurebutton18();
        configurebutton19();
        configurebutton219();
        
    }

    private void configurebutton219() {
        Button button219 = (Button) findViewById(R.id.button219);
        button219.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, quiz2.class));
            }

        });
    }

    private void configurebutton19() {
        Button button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, preprocessor.class));
            }

        });
    }

    private void configurebutton18() {
        Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, storageclasses.class));
            }

        });
    }

    private void configurebutton17() {
        Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, scoperules.class));
            }

        });
    }

    private void configurebutton16() {
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, parameterpassing.class));
            }

        });
    }

    private void configurebutton15() {
        Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, functioncategories.class));
            }

        });
    }

    private void configurebutton14() {
        Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, functions.class));
            }

        });
    }

    private void configurebutton9() {
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, lcstats.class));
            }

        });
    }

    private void confugurebutton6() {
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cs.this, cstats.class));
            }

        });
    }
}
