package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class files extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files);
        configurebutton63();
        configurebutton62();
        configurebutton64();
        configurebutton65();
        configurebutton66();
        configurebutton67();
        configurebutton223();
    }

    private void configurebutton223() {
        Button button223 = (Button) findViewById(R.id.button223);
        button223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(files.this, quiz6.class));
            }

        });
    }

    private void configurebutton67() {
        Button button67 = (Button) findViewById(R.id.button67);
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(files.this, sorting.class));
            }

        });
    }

    private void configurebutton66() {
        Button button66 = (Button) findViewById(R.id.button66);
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(files.this, searching.class));
            }

        });
    }

    private void configurebutton65() {
        Button button65 = (Button) findViewById(R.id.button65);
        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(files.this, characterio.class));
            }

        });
    }

    private void configurebutton64() {
        Button button64 = (Button) findViewById(R.id.button64);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(files.this, standardlib.class));
            }

        });
    }

    private void configurebutton62() {
        Button button62 = (Button) findViewById(R.id.button62);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(files.this, fileintro.class));
            }

        });
    }


    private void configurebutton63() {
        Button button63 = (Button) findViewById(R.id.button63);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(files.this, filemodes.class));
            }

        });
    }
}
