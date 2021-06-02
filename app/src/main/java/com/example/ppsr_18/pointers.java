package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pointers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointers);
        configurebutton28();
        configurebutton37();
        configurebutton39();
        configurebutton40();
        configurebutton51();
        configurebutton47();
        configurebutton45();
        configurebutton49();
        configurebutton48();
        configurebutton46();
        configurebutton42();
        configurebutton43();
        configurebutton44();
        configurebutton221();
            }

    private void configurebutton221() {
            Button button221 = (Button) findViewById(R.id.button221);
            button221.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(pointers.this, quiz4.class));
                }

            });
    }

    private void configurebutton44() {
        Button button44 = (Button) findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, smanipulationfuntions.class));
            }

        });
    }

    private void configurebutton43() {
        Button button43 = (Button) findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, stringarray.class));
            }

        });
    }

    private void configurebutton42() {
        Button button42 = (Button) findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, stringsio.class));
            }

        });
    }

    private void configurebutton46() {
        Button button46 = (Button) findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, stringconcepts.class));
            }

        });
    }

    private void configurebutton48() {
        Button button48 = (Button) findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, carguments.class));
            }

        });
    }

    private void configurebutton49() {
        Button button49 = (Button) findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, pointerstofunctions.class));
            }

        });
    }

    private void configurebutton45() {
        Button button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, pointerstovoid.class));
            }

        });
    }

    private void configurebutton47() {
        Button button47 = (Button) findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, arrayofpointers.class));
            }

        });
    }

    private void configurebutton51() {
        Button button51 = (Button) findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, memoryallocation.class));
            }

        });
    }

    private void configurebutton40() {
        Button button40 = (Button) findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, pointerarithmetic.class));
            }

        });
    }

    private void configurebutton39() {
        Button button39 = (Button) findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, arraysandpointers.class));
            }

        });
    }

    private void configurebutton37() {
        Button button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, pointerstopointers.class));
            }

        });
    }

    private void configurebutton28() {
        Button button28 = (Button) findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pointers.this, pointersintro.class));
            }

        });
    }
}
