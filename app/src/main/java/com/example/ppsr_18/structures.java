package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class structures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structures);
        configurebutton52();
        configurebutton53();
        configurebutton54();
        configurebutton55();
        configurebutton56();
        configurebutton57();
        configurebutton58();
        configurebutton59();
        configurebutton60();
        configurebutton61();
        configurebutton222();
    }

    private void configurebutton222() {
        Button button222 = (Button) findViewById(R.id.button222);
        button222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, quiz5.class));
            }

        });
    }

    private void configurebutton60() {
        Button button60 = (Button) findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, typedef.class));
            }

        });
    }

    private void configurebutton61() {
        Button button61 = (Button) findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, enumeratedtypes.class));
            }

        });
    }

    private void configurebutton59() {
        Button button59 = (Button) findViewById(R.id.button59);
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, union.class));
            }

        });
    }

    private void configurebutton58() {
        Button button58 = (Button) findViewById(R.id.button58);
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, structurespointers.class));
            }
        });
    }

    private void configurebutton57() {
        Button button57 = (Button) findViewById(R.id.button57);
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, structuresfunctions.class));
            }

        });
    }

    private void configurebutton56() {
        Button button56 = (Button) findViewById(R.id.button56);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, structurearrays.class));
            }

        });
    }

    private void configurebutton55() {
        Button button55 = (Button) findViewById(R.id.button55);
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, nestedstructures.class));
            }

        });
    }

    private void configurebutton54() {
        Button button54 = (Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, accesingstructures.class));
            }

        });
    }

    private void configurebutton53() {
        Button button53 = (Button) findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, structureinitialization.class));
            }

        });
    }

    private void configurebutton52() {
        Button button52 = (Button) findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(structures.this, structuredefiniton.class));
            }

        });
    }
}
