package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurebutton68();
        configurebutton216();

    }

    private void configurebutton216() {
        Button button216 = (Button) findViewById(R.id.button216);
        button216.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, quizzes.class));
            }

        });
    }



    private void configurebutton68() {
        Button button68 = (Button) findViewById(R.id.button68);
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, homeactivity.class));
            }

        });
    }

    public void browser133(View view) {
        Intent browserIntent = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.programiz.com/c-programming/online-compiler/" ) );
        startActivity( browserIntent );
    }
}
